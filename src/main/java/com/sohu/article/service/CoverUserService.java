package com.sohu.article.service;

import com.sohu.article.dto.UserToken;
import com.sohu.article.dto.WxLoginInfo;
import com.sohu.article.model.CoverUserEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:04
 * @Description:
 */
public interface CoverUserService {
    CoverUserEntity queryByName(String name);
    CoverUserEntity queryById(Integer userId);
    void add(CoverUserEntity user);

    void update(CoverUserEntity user);

    UserToken wxLogin(WxLoginInfo wxLoginInfo, HttpServletRequest request);
}
