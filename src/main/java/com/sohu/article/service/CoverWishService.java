package com.sohu.article.service;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.model.CoverWishesEntity;


/**
 * @Auther: lizubing1992
 * @Date: 2019/1/7 16:53
 * @Description:
 */
public interface CoverWishService {
    PageResultBean<CoverWishesEntity> getListByType(String wishType, int pageSize, int pageNo);

    CoverWishesEntity selectById(Integer wishId);
}
