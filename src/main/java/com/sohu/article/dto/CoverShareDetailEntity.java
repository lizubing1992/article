package com.sohu.article.dto;

import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.model.CoverMusicEntity;
import com.sohu.article.model.CoverShareEntity;
import com.sohu.article.model.CoverUserEntity;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 14:25
 * @Description:
 */
public class CoverShareDetailEntity {
    private CoverUserEntity userEntity;
    private CoverImgEntity imgEntity;
    private CoverMusicEntity musicEntity;
    private CoverShareEntity shareEntity;

    public CoverUserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(CoverUserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public CoverImgEntity getImgEntity() {
        return imgEntity;
    }

    public void setImgEntity(CoverImgEntity imgEntity) {
        this.imgEntity = imgEntity;
    }

    public CoverMusicEntity getMusicEntity() {
        return musicEntity;
    }

    public void setMusicEntity(CoverMusicEntity musicEntity) {
        this.musicEntity = musicEntity;
    }

    public CoverShareEntity getShareEntity() {
        return shareEntity;
    }

    public void setShareEntity(CoverShareEntity shareEntity) {
        this.shareEntity = shareEntity;
    }
}
