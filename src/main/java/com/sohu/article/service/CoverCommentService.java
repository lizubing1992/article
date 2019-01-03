package com.sohu.article.service;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.dto.CommentDetailEntity;

import java.util.List;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 17:30
 * @Description:
 */
public interface CoverCommentService {
    void addComment(String comment, Integer userId, Integer coverId);

    PageResultBean<CommentDetailEntity> list(Integer coverId, Integer pageNo, Integer pageSize);

}
