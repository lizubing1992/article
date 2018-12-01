package com.sohu.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sohu.article.base.PageResultBean;
import com.sohu.article.constant.WebConst;
import com.sohu.article.dao.ArticleEntityMapper;
import com.sohu.article.model.ArticleEntity;
import com.sohu.article.model.ArticleEntityExample;
import com.sohu.article.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by administrator on 2018/11/29.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleEntityMapper articleEntityMapper;

    @Override
    public ArticleEntity getIndex(String id) {
        ArticleEntityExample example = new ArticleEntityExample();
        ArticleEntityExample.Criteria criteria = example.createCriteria();
        criteria.andUrlObjectIdEqualTo(id);
        List<ArticleEntity> list = articleEntityMapper.selectByExampleWithBLOBs(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return new ArticleEntity();
    }

    @Override
    public PageResultBean<ArticleEntity> list(String articleType, Integer pageNo, Integer pageSize) {
        PageResultBean<ArticleEntity> pageResultBean = new PageResultBean<>();
        pageNo = pageNo < 0 || pageNo > WebConst.MAX_PAGE ? 1 : pageNo;
        ArticleEntityExample example = new ArticleEntityExample();
        ArticleEntityExample.Criteria criteria = example.createCriteria();
        criteria.andArticleTypeEqualTo(articleType);
        example.setOrderByClause("publish_time desc");
        long total = articleEntityMapper.countByExample(example);
        PageHelper.startPage(pageNo, pageSize);
        List<ArticleEntity> list = articleEntityMapper.selectByExample(example);
        PageInfo<ArticleEntity> paginator = new PageInfo<>(list);
        pageResultBean.setTotal((int)total);
        pageResultBean.setList(paginator.getList());
        return pageResultBean;
    }
}
