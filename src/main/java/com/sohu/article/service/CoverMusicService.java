package com.sohu.article.service;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.model.CoverMusicEntity;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 10:34
 * @Description:
 */
public interface CoverMusicService {

    void addCoverMusic(String musicUrl, String musicName, String musicAuthor);

    PageResultBean<CoverMusicEntity> list(Integer pageNo, Integer pageSize);

    void updateMusic(Integer musicId, String musicUrl, String musicName, String musicAuthor);

    CoverMusicEntity selectById(Integer musicId);

}
