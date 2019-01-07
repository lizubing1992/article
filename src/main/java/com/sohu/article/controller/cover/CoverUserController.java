package com.sohu.article.controller.cover;

import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.dto.UserToken;
import com.sohu.article.dto.WxLoginInfo;
import com.sohu.article.service.CoverUserService;
import com.sohu.article.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lizubing
 * @time 2019-01-02
 */
@RestController
@RequestMapping("article/cover")
public class CoverUserController {


    @Autowired
    private CoverUserService userService;

    @ApiOperation(value="微信登录", notes="微信登录")
    @PostMapping("/login")
    public WebResponse<UserToken> wexinLogin(@RequestBody WxLoginInfo wxLoginInfo, HttpServletRequest request){
        return ResponseBuilder.build(userService.wxLogin(wxLoginInfo,request));
    }
}
