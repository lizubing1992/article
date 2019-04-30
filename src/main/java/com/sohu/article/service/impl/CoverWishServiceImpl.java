package com.sohu.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sohu.article.base.PageResultBean;
import com.sohu.article.constant.WebConst;
import com.sohu.article.dao.CoverWishesEntityMapper;
import com.sohu.article.exception.TipException;
import com.sohu.article.model.CoverCommentEntityExample;
import com.sohu.article.model.CoverWishesEntity;
import com.sohu.article.model.CoverWishesEntityExample;
import com.sohu.article.service.CoverWishService;
import com.sohu.article.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/7 16:53
 * @Description:
 */
@Service
public class CoverWishServiceImpl implements CoverWishService {

    @Autowired
    private CoverWishesEntityMapper coverWishesEntityMapper;

    @Override
    public PageResultBean<CoverWishesEntity> getListByType(String wishType, int pageSize, int pageNo) {
        if (StringUtils.isBlank(wishType)) {
            throw  new TipException("贺词不能为空");
        }
        PageResultBean<CoverWishesEntity> pageResultBean = new PageResultBean<>();
        pageNo = pageNo<0 || pageNo > WebConst.MAX_PAGE ? 1:pageNo;
        CoverWishesEntityExample example = new CoverWishesEntityExample();
        example.createCriteria().andWishTypeEqualTo(wishType);
        PageHelper.startPage(pageNo,pageSize);
        List<CoverWishesEntity> list = coverWishesEntityMapper.selectByExampleWithBLOBs(example);
        long count = coverWishesEntityMapper.countByExample(example);
        PageInfo<CoverWishesEntity> pageInfo = new PageInfo<>(list);
        pageResultBean.setTotal((int) count);
        pageResultBean.setList(pageInfo.getList());
        return pageResultBean;
    }

    @Override
    public CoverWishesEntity selectById(Integer wishId) {
        return coverWishesEntityMapper.selectByPrimaryKey(wishId);
    }

    @Override
    public CoverWishesEntity selectByRandomAphorism() {
        return coverWishesEntityMapper.selectByRandomAphorism("aphorism");
    }
}
