package com.sohu.article.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.sohu.article.constant.UserTokenManager;
import com.sohu.article.dao.WxUserEntityMapper;
import com.sohu.article.dto.UserInfo;
import com.sohu.article.dto.UserToken;
import com.sohu.article.dto.WxLoginInfo;
import com.sohu.article.exception.TipException;
import com.sohu.article.model.WxUserEntity;
import com.sohu.article.model.WxUserEntityExample;
import com.sohu.article.service.UserService;
import com.sohu.article.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author lizubing
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private WxMaService wxService;

    @Autowired
    private WxUserEntityMapper userEntityMapper;

    @Override
    public WxUserEntity queryByOid(String openId) {
        WxUserEntityExample example = new WxUserEntityExample();
        example.or().andWeixinOpenidEqualTo(openId);
        return userEntityMapper.selectOneByExample(example);
    }

    @Override
    public void add(WxUserEntity user) {
        userEntityMapper.insert(user);
    }

    @Override
    public void update(WxUserEntity user) {
        userEntityMapper.updateWithVersionByPrimaryKeySelective(user.getVersion(),user);
    }

    @Override
    public UserToken wxLogin(WxLoginInfo wxLoginInfo, HttpServletRequest request)throws TipException {
        String code = wxLoginInfo.getCode();
        UserInfo userInfo = wxLoginInfo.getUserInfo();
        if (code == null || userInfo == null) {
            throw  new TipException("参数不正确");
        }

        String sessionKey = null;
        String openId = null;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
            sessionKey = result.getSessionKey();
            openId = result.getOpenid();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (sessionKey == null || openId == null) {
            throw  new TipException("请求openId以及sessionkey异常！");
        }

        WxUserEntity user = this.queryByOid(openId);
        if (user == null) {
            user = new WxUserEntity();
            user.setUsername(userInfo.getNickName());  // 其实没有用，因为用户没有真正注册
            user.setUserPwd(openId);                  // 其实没有用，因为用户没有真正注册
            user.setWeixinOpenid(openId);
            user.setAvatar(userInfo.getAvatarUrl());
            user.setNickname(userInfo.getNickName());
            user.setGender(userInfo.getGender());
            user.setLastLoginTime(new Date());
            user.setLastLoginIp(IpUtil.client(request));
            user.setAddTime(new Date());

            this.add(user);
        } else {
            user.setLastLoginTime(new Date());
            user.setLastLoginIp(IpUtil.client(request));
            this.update(user);
        }
        UserToken userToken = UserTokenManager.generateToken(user.getId());
        userToken.setSessionKey(sessionKey);
        return userToken;
    }
}
