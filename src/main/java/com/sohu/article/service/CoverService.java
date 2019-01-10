package com.sohu.article.service;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.model.CoverImgEntity;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:24
 * @Description:
 */
public interface CoverService {

    void addCoverImg(String imgUrl);

    PageResultBean<CoverImgEntity> list(Integer pageNo, Integer pageSize);

    void coverClick(Integer coverId);

    void updateCoverCommentNum(Integer commentNum,Integer coverId);
}
