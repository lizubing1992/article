package com.sohu.article.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class UserToken {
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("用户token")
    private String token;
    @ApiModelProperty("微信生成的sessionKey")
    private String sessionKey;
    @ApiModelProperty("加入时间")
    private Date expireTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
