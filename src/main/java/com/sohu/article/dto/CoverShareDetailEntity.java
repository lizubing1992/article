package com.sohu.article.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 14:25
 * @Description:
 */
public class CoverShareDetailEntity {
    @ApiModelProperty(value = "username 用户名")
    private String username;
    @ApiModelProperty(value = "avatar用户头像")
    private String avatar;
    @ApiModelProperty(value = "shareDate分享时间")
    private Date shareDate;
    @ApiModelProperty(value = "musicUrl歌曲url")
    private String musicUrl;
    @ApiModelProperty(value = "imgUrl封面url")
    private String imgUrl;
    @ApiModelProperty(value = "wishWord贺词")
    private String wishWord;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getShareDate() {
        return shareDate;
    }

    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWishWord() {
        return wishWord;
    }

    public void setWishWord(String wishWord) {
        this.wishWord = wishWord;
    }
}
