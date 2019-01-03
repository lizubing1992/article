package com.sohu.article.service.impl;

import com.sohu.article.constant.UserTokenManager;
import com.sohu.article.dao.CoverUserEntityMapper;
import com.sohu.article.dto.UserInfo;
import com.sohu.article.dto.UserToken;
import com.sohu.article.dto.WxLoginInfo;
import com.sohu.article.exception.TipException;
import com.sohu.article.model.CoverUserEntity;
import com.sohu.article.model.CoverUserEntityExample;
import com.sohu.article.model.WxUserEntity;
import com.sohu.article.service.CoverUserService;
import com.sohu.article.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:05
 * @Description:
 */
@Service
public class CoverUserServiceImpl implements CoverUserService {

    @Autowired
    private CoverUserEntityMapper coverUserEntityMapper;

    @Override
    public CoverUserEntity queryByName(String name) {
        CoverUserEntityExample example = new CoverUserEntityExample();
        example.or().andNicknameEqualTo(name);
        return coverUserEntityMapper.selectOneByExample(example);
    }

    @Override
    public CoverUserEntity queryById(Integer userId) {
        CoverUserEntityExample example = new CoverUserEntityExample();
        example.or().andIdEqualTo(userId);
        return coverUserEntityMapper.selectOneByExample(example);
    }

    @Override
    public void add(CoverUserEntity user) {
        coverUserEntityMapper.insert(user);
    }

    @Override
    public void update(CoverUserEntity user) {
        coverUserEntityMapper.updateWithVersionByPrimaryKeySelective(user.getVersion(),user);
    }

    @Override
    public UserToken wxLogin(WxLoginInfo wxLoginInfo, HttpServletRequest request) {
        String code = wxLoginInfo.getCode();
        UserInfo userInfo = wxLoginInfo.getUserInfo();
        if (code == null || userInfo == null) {
            throw  new TipException("参数不正确");
        }

        /*String sessionKey = null;
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
        }*/

        CoverUserEntity user = this.queryByName(userInfo.getNickName());
        if (user == null) {
            user = new CoverUserEntity();
            user.setUsername(userInfo.getNickName());  // 其实没有用，因为用户没有真正注册
            user.setUserPwd("");                  // 其实没有用，因为用户没有真正注册
            user.setWeixinOpenid("");
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
//        userToken.setSessionKey(sessionKey);
        return userToken;
    }
}
