package com.sohu.article.service.impl;

import com.sohu.article.dao.CoverShareEntityMapper;
import com.sohu.article.dto.CoverShareDetailEntity;
import com.sohu.article.exception.TipException;
import com.sohu.article.model.*;
import com.sohu.article.service.*;
import com.sohu.article.utils.LunaUtils;
import com.sohu.article.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/24 14:27
 * @Description:
 */
@Service
public class CoverShareServiceImpl implements CoverShareService {

    @Autowired
    private CoverShareEntityMapper shareEntityMapper;

    @Autowired
    private CoverUserService userService;

    @Autowired
    private CoverMusicService musicService;

    @Autowired
    private CoverService coverService;

    @Autowired
    private CoverWishService wishService;


    @Override
    public Integer addCoverShare(Integer musicId, Integer userId, Integer wishId, Integer coverId, String shareWish) {
        if (coverId <= 0) {
            throw new TipException("贺卡id不能为空");
        }
        if (userId <= 0) {
            throw new TipException("用户id不能为空");
        }
        if (musicId <= 0) {
            throw new TipException("音乐id不能为空");
        }
        CoverShareEntity entity = new CoverShareEntity();
        entity.setMusicId(musicId);
        entity.setUserId(userId);
        entity.setImgId(coverId);
        entity.setWishId(wishId);
        if(null != wishId && wishId  > 0){
            CoverWishesEntity wishesEntity = wishService.selectById(wishId);
            entity.setWishWord(wishesEntity.getWishContent());
        }else {
            entity.setWishWord(shareWish);
        }
        entity.setShareDate(new Date());
        shareEntityMapper.insert(entity);
        return entity.getShareId();
    }

    @Override
    public CoverShareDetailEntity index(Integer shareId) {
        if (shareId <= 0) {
            throw new TipException("分享id不能为空");
        }
        CoverShareDetailEntity detailEntity = new CoverShareDetailEntity();
        CoverShareEntity coverShareEntity = shareEntityMapper.selectByPrimaryKey(shareId);
        CoverUserEntity userEntity = userService.queryById(coverShareEntity.getUserId());
        CoverImgEntity coverImgEntity = coverService.selectById(coverShareEntity.getImgId());
        CoverMusicEntity musicEntity = musicService.selectById(coverShareEntity.getMusicId());
        detailEntity.setUsername(userEntity.getUsername());
        detailEntity.setAvatar(userEntity.getAvatar());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String d = dateFormat.format(coverShareEntity.getShareDate());
        Calendar today = Calendar.getInstance();
        LunaUtils lunar = new LunaUtils(today);
        try {
            today.setTime(lunar.chineseDateFormat.parse(d));
            detailEntity.setShareDate(d);
            detailEntity.setShareChinaDate("农历" + lunar);
        } catch (ParseException e) {
            e.printStackTrace();
            detailEntity.setShareDate(d);
            detailEntity.setShareChinaDate("农历" +lunar.chineseDateFormat.format(today.getTime()));
        }
        if(coverImgEntity != null){
            if(StringUtils.isBlank(coverImgEntity.getImgBigUrl())){
                detailEntity.setImgUrl(coverImgEntity.getImgUrl());
            }else {
                detailEntity.setImgUrl(coverImgEntity.getImgBigUrl());
            }
        }
        detailEntity.setWishWord(coverShareEntity.getWishWord());
        detailEntity.setMusicUrl(musicEntity.getMusicUrl());
        return detailEntity;
    }
}
