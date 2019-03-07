package com.sohu.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sohu.article.base.PageResultBean;
import com.sohu.article.constant.WebConst;
import com.sohu.article.dao.CoverImgEntityMapper;
import com.sohu.article.exception.TipException;
import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.model.CoverImgEntityExample;
import com.sohu.article.service.CoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:37
 * @Description:
 */
@Service
public class CoverServiceImpl implements CoverService {

    @Autowired
    private CoverImgEntityMapper coverImgEntityMapper;

    @Override
    public void addCoverImg(String imgUrl,String imgType,String wishType) {
        CoverImgEntity entity = new CoverImgEntity();
        entity.setImgUrl(imgUrl);
        entity.setCommentNums(0);
        entity.setZanNums(0);
        entity.setImgType(imgType);
        entity.setWishType(wishType);
        entity.setImgSmallUrl("");
        entity.setImgBigUrl(imgUrl);
        coverImgEntityMapper.insert(entity);
    }

    @Override
    public void updateCover(Integer coverId,String imgType,String wishType) {
        CoverImgEntity entity = coverImgEntityMapper.selectByPrimaryKey(coverId);
        entity.setCoverId(coverId);
        entity.setImgType(imgType);
        entity.setWishType(wishType);
        coverImgEntityMapper.updateByPrimaryKey(entity);
    }

    @Override
    public PageResultBean<CoverImgEntity> list(Integer pageNo, Integer pageSize) {
        PageResultBean<CoverImgEntity> pageResultBean = new PageResultBean<>();
        pageNo = pageNo < 0 || pageNo > WebConst.MAX_PAGE ? 1 : pageNo;
        CoverImgEntityExample example = new CoverImgEntityExample();
        long total = coverImgEntityMapper.countByExample(example);
        PageHelper.startPage(pageNo, pageSize);
        List<CoverImgEntity> list = coverImgEntityMapper.selectByExample(example);
        PageInfo<CoverImgEntity> paginator = new PageInfo<>(list);
        pageResultBean.setTotal((int) total);
        pageResultBean.setList(paginator.getList());
        return pageResultBean;
    }

    @Override
    public PageResultBean<CoverImgEntity> list(Integer pageNo, Integer pageSize, String type) {
        PageResultBean<CoverImgEntity> pageResultBean = new PageResultBean<>();
        pageNo = pageNo < 0 || pageNo > WebConst.MAX_PAGE ? 1 : pageNo;
        CoverImgEntityExample example = new CoverImgEntityExample();
        example.createCriteria().andImgTypeEqualTo(type);
        long total = coverImgEntityMapper.countByExample(example);
        PageHelper.startPage(pageNo, pageSize);
        List<CoverImgEntity> list = coverImgEntityMapper.selectByExample(example);
        PageInfo<CoverImgEntity> paginator = new PageInfo<>(list);
        pageResultBean.setTotal((int) total);
        pageResultBean.setList(paginator.getList());
        return pageResultBean;
    }

    @Override
    public void coverClick(Integer coverId) {
        if (coverId <=0) {
            throw  new TipException("贺卡id不能为空");
        }
        CoverImgEntityExample example = new CoverImgEntityExample();
        example.createCriteria().andCoverIdEqualTo(coverId);
        CoverImgEntity imgEntity = coverImgEntityMapper.selectOneByExample(example);
        if (imgEntity != null) {
            imgEntity.setZanNums(imgEntity.getZanNums() + 1);
            coverImgEntityMapper.updateByPrimaryKeySelective(imgEntity);
        } else {
            throw new TipException("没有找到对应的贺卡信息");
        }
    }

    @Override
    public void updateCoverCommentNum(Integer commentNum, Integer coverId) {
        CoverImgEntity entity = coverImgEntityMapper.selectByPrimaryKey(coverId);
        entity.setCommentNums(commentNum);
        coverImgEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public CoverImgEntity selectById(Integer coverId) {
        return coverImgEntityMapper.selectByPrimaryKey(coverId);
    }
}
