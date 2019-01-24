package com.sohu.article.controller.cover;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.model.CoverMusicEntity;
import com.sohu.article.service.CoverMusicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 16:22
 * @Description:
 */
@Api(value = "贺卡歌曲相关", description = "贺卡歌曲相关")
@RestController
@RequestMapping("article/cover/music")
public class CoverMusicController {

    @Autowired
    private CoverMusicService coverMusicService;

    @ApiOperation(value = "获取歌曲列表", notes = "获取歌曲列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query", defaultValue = "20")})
    @GetMapping("/list")
    public WebResponse<PageResultBean<CoverMusicEntity>> list(Integer pageNo, Integer pageSize) {
        return ResponseBuilder.build(coverMusicService.list(pageNo, pageSize));
    }

    @ApiOperation(value = "新增加歌曲", notes = "新增加歌曲")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "musicUrl", value = "歌曲路径url", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "musicName", value = "歌曲名字", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "musicAuthor", value = "歌曲作者", required = true, dataType = "String", paramType = "query")})
    @PostMapping("/add")
    public WebResponse<String> add(String musicUrl, String musicName, String musicAuthor) {
        coverMusicService.addCoverMusic(musicUrl,musicName,musicAuthor);
        return ResponseBuilder.build("歌曲添加成功!");
    }


    @ApiOperation(value = "修改歌曲", notes = "修改歌曲")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "musicId", value = "歌曲id", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "musicUrl", value = "歌曲路径", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "musicName", value = "歌曲名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "musicAuthor", value = "歌曲作者", required = true, dataType = "String", paramType = "query")})
    @PostMapping("/img/update")
    public WebResponse<String> updateCover(Integer musicId, String musicUrl,String musicName, String musicAuthor) {
        coverMusicService.updateMusic(musicId,musicUrl,musicName,musicAuthor);
        return ResponseBuilder.build("修改成功！!");
    }
}
