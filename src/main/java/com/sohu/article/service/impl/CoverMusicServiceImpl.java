package com.sohu.article.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sohu.article.base.PageResultBean;
import com.sohu.article.constant.WebConst;
import com.sohu.article.dao.CoverMusicEntityMapper;
import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.model.CoverImgEntityExample;
import com.sohu.article.model.CoverMusicEntity;
import com.sohu.article.model.CoverMusicEntityExample;
import com.sohu.article.service.CoverMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 10:35
 * @Description:
 */
@Service
public class CoverMusicServiceImpl implements CoverMusicService {
    @Autowired
    private CoverMusicEntityMapper musicEntityMapper;

    @Override
    public void addCoverMusic(String musicUrl, String musicName, String musicAuthor) {
        CoverMusicEntity entity = new CoverMusicEntity();
        entity.setMusicUrl(musicUrl);
        entity.setMusicName(musicName);
        entity.setMusicAuthor(musicAuthor);
        musicEntityMapper.insert(entity);
    }

    @Override
    public PageResultBean<CoverMusicEntity> list(Integer pageNo, Integer pageSize) {
        PageResultBean<CoverMusicEntity> pageResultBean = new PageResultBean<>();
        pageNo = pageNo < 0 || pageNo > WebConst.MAX_PAGE ? 1 : pageNo;
        CoverMusicEntityExample example = new CoverMusicEntityExample();
        long total = musicEntityMapper.countByExample(example);
        PageHelper.startPage(pageNo, pageSize);
        List<CoverMusicEntity> list = musicEntityMapper.selectByExample(example);
        PageInfo<CoverMusicEntity> paginator = new PageInfo<>(list);
        pageResultBean.setTotal((int) total);
        pageResultBean.setList(paginator.getList());
        return pageResultBean;
    }

    @Override
    public void updateMusic(Integer musicId, String musicUrl, String musicName, String musicAuthor) {
        CoverMusicEntity entity = musicEntityMapper.selectByPrimaryKey(musicId);
        entity.setMusicUrl(musicUrl);
        entity.setMusicName(musicName);
        entity.setMusicAuthor(musicAuthor);
        musicEntityMapper.updateByPrimaryKey(entity);
    }

    @Override
    public CoverMusicEntity selectById(Integer musicId) {
        return musicEntityMapper.selectByPrimaryKey(musicId);
    }
}
