package com.sohu.article.controller.cover;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.service.CoverService;
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
@RestController
@RequestMapping("article/cover")
public class CoverController {

    @Autowired
    private CoverService coverService;

    @ApiOperation(value = "获取贺卡列表", notes = "获取贺卡列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query", defaultValue = "20")})
    @GetMapping("/img/list")
    public WebResponse<PageResultBean<CoverImgEntity>> list(Integer pageNo, Integer pageSize) {
        return ResponseBuilder.build(coverService.list(pageNo, pageSize));
    }

    @ApiOperation(value = "获取贺卡列表", notes = "获取贺卡列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query", defaultValue = "20")})
    @GetMapping("/mp3/list")
    public WebResponse<PageResultBean<CoverImgEntity>> mp3List(Integer pageNo, Integer pageSize) {
        return ResponseBuilder.build(coverService.list(pageNo, pageSize, "mp3"));
    }


    @ApiOperation(value = "新增加贺卡", notes = "新增加贺卡")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "imgUrl", value = "图片路径url", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "imgType", value = "图片类型", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "wishType", value = "贺词类型", required = true, dataType = "String", paramType = "query")})
    @PostMapping("/img/add")
    public WebResponse<String> add(String imgUrl, String imgType, String wishType) {
        coverService.addCoverImg(imgUrl,imgType,wishType);
        return ResponseBuilder.build("贺卡加入成功!");
    }


    @ApiOperation(value = "修改加贺类型", notes = "修改加贺类型")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "coverId", value = "资源id,图片和音乐都行", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "imgType", value = "类型", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "wishType", value = "贺词类型", required = true, dataType = "String", paramType = "query")})
    @PostMapping("/img/update")
    public WebResponse<String> updateCover(Integer coverId, String imgType, String wishType) {
        coverService.updateCover(coverId,imgType,wishType);
        return ResponseBuilder.build("贺卡加入成功!");
    }


    @ApiOperation(value = "贺卡点赞", notes = "贺卡点赞")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "coverId", value = "贺卡id", required = true, dataType = "Integer", paramType = "query")})
    @GetMapping("/click")
    public WebResponse<String> coverClick(Integer coverId) {
        coverService.coverClick(coverId);
        return ResponseBuilder.build("贺卡点赞成功!");
    }


}
