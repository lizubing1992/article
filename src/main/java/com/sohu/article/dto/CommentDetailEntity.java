package com.sohu.article.dto;

import com.sohu.article.model.CoverCommentEntity;
import com.sohu.article.model.CoverUserEntity;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 17:32
 * @Description: 评论详情
 */
public class CommentDetailEntity {
    @ApiModelProperty(value="comment 评论数据bean")
    private CoverCommentEntity comment;
    @ApiModelProperty(value="user 评论人数据bean")
    private CoverUserEntity user;

    public CoverCommentEntity getComment() {
        return comment;
    }

    public void setComment(CoverCommentEntity comment) {
        this.comment = comment;
    }

    public CoverUserEntity getUser() {
        return user;
    }

    public void setUser(CoverUserEntity user) {
        this.user = user;
    }
}
