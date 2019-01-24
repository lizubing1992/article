package com.sohu.article.service;

import com.sohu.article.dto.CoverShareDetailEntity;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 14:22
 * @Description:
 */
public interface CoverShareService {

    void addCoverShare(Integer musicId, Integer userId, Integer wishId, Integer coverId, String shareWish);

    CoverShareDetailEntity index(Integer shareId);
}
