package com.sohu.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sohu.article.base.PageResultBean;
import com.sohu.article.constant.WebConst;
import com.sohu.article.dao.CoverCommentEntityMapper;
import com.sohu.article.dto.CommentDetailEntity;
import com.sohu.article.model.CoverCommentEntity;
import com.sohu.article.model.CoverCommentEntityExample;
import com.sohu.article.model.CoverUserEntity;
import com.sohu.article.service.CoverCommentService;
import com.sohu.article.service.CoverUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 17:33
 * @Description:
 */
@Service
public class CoverCommentServiceImpl implements CoverCommentService {
    @Autowired
    private CoverCommentEntityMapper coverCommentEntityMapper;
    @Autowired
    private CoverUserService userService;

    @Override
    public void addComment(String comment, Integer userId, Integer coverId) {
        CoverCommentEntity entity = new CoverCommentEntity();
        entity.setCommentContent(comment);
        entity.setUserId(userId);
        entity.setCoverId(coverId);
        entity.setCommentTime(new Date());
        coverCommentEntityMapper.insert(entity);
    }

    @Override
    public PageResultBean<CommentDetailEntity> list(Integer coverId, Integer pageNo, Integer pageSize) {
        PageResultBean<CommentDetailEntity> pageResultBean = new PageResultBean();
        List<CommentDetailEntity> commentDetailList = new ArrayList<>();
        pageNo = pageNo < 0 || pageNo > WebConst.MAX_PAGE ? 1 : pageNo;
        CoverCommentEntityExample example = new CoverCommentEntityExample();
        example.setOrderByClause("comment_time desc");
        long total = coverCommentEntityMapper.countByExample(example);
        PageHelper.startPage(pageNo, pageSize);
        List<CoverCommentEntity> list = coverCommentEntityMapper.selectByExampleWithBLOBs(example);
        PageInfo<CoverCommentEntity> pageInfo = new PageInfo<>(list);
        pageResultBean.setTotal((int) total);
        CommentDetailEntity detailEntity = null;
        for (CoverCommentEntity entity : pageInfo.getList()) {
            detailEntity = new CommentDetailEntity();
            detailEntity.setComment(entity);
            CoverUserEntity userEntity = userService.queryById(entity.getUserId());
            if(userEntity != null){
                detailEntity.setUser(userEntity);
            }else {
                detailEntity.setUser(new CoverUserEntity());
            }
            commentDetailList.add(detailEntity);
        }
        pageResultBean.setList(commentDetailList);
        return pageResultBean;
    }
}
