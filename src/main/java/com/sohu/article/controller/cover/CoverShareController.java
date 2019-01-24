package com.sohu.article.controller.cover;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.dto.CoverShareDetailEntity;
import com.sohu.article.model.CoverMusicEntity;
import com.sohu.article.service.CoverMusicService;
import com.sohu.article.service.CoverShareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sohu.article.base.ResponseBuilder.build;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:22
 * @Description:
 */
@Api(value = "贺卡分享相关", description = "贺卡分享相关")
@RestController
@RequestMapping("article/cover/share")
public class CoverShareController {

    @Autowired
    private CoverShareService shareService;


    @ApiOperation(value = "新增加分享", notes = "新增加分享")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "musicId", value = "歌曲id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "coverId", value = "卡片id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "shareWish", value = "贺词内容", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "wishId", value = "贺词id，自己选择的则填写id", required = false, dataType = "Integer", paramType = "query")})
    @PostMapping("/add")
    public WebResponse<String> add(Integer musicId, Integer userId, Integer wishId, Integer coverId, String shareWish) {
        shareService.addCoverShare(musicId,userId,wishId,coverId,shareWish);
        return build("分享添加成功!");
    }


    @ApiOperation(value = "获取分享", notes = "获取分享")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shareId", value = "分享id", required = true, dataType = "Integer", paramType = "query")})
    @GetMapping("/select")
    public WebResponse<CoverShareDetailEntity> updateCover(Integer shareId) {
        return ResponseBuilder.build(shareService.index(shareId));
    }
}
