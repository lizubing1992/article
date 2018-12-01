package com.sohu.article.service;


import com.sohu.article.base.PageResultBean;
import com.sohu.article.model.ArticleEntity;

/**
 * Created by administrator on 2018/11/29.
 */
public interface ArticleService {
    ArticleEntity getIndex(String id);

    PageResultBean<ArticleEntity> list(String id, Integer pageNo, Integer pageSize);
}
