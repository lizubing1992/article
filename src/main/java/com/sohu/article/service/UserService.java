package com.sohu.article.service;

import com.sohu.article.dto.UserToken;
import com.sohu.article.dto.WxLoginInfo;
import com.sohu.article.model.WxUserEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信登录相关的Service
 * @author lizubing
 */
public interface UserService {
    WxUserEntity queryByOid(String openId);

    void add(WxUserEntity user);

    void update(WxUserEntity user);

    UserToken wxLogin(WxLoginInfo wxLoginInfo, HttpServletRequest request);
}
