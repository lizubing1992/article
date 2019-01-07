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

    @ApiOperation(value="获取贺卡列表", notes="获取贺卡列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query",defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query",defaultValue = "20")})
    @GetMapping("/img/list")
    public WebResponse<PageResultBean<CoverImgEntity>> list( Integer pageNo, Integer pageSize){
        return ResponseBuilder.build(coverService.list(pageNo,pageSize));
    }


    @ApiOperation(value="新增加贺卡", notes="新增加贺卡")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "imgUrl", value = "图片路径url", required = true, dataType = "String", paramType = "query")})
    @GetMapping("/img/add")
    public WebResponse<String> add(String  imgUrl){
         coverService.addCoverImg(imgUrl);
         return ResponseBuilder.build("贺卡加入成功!");
    }



    @ApiOperation(value="贺卡点赞", notes="贺卡点赞")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "coverId", value = "贺卡id", required = true, dataType = "Integer", paramType = "query")})
    @GetMapping("/click")
    public WebResponse<String> coverClick(Integer  coverId){
        coverService.coverClick(coverId);
        return ResponseBuilder.build("贺卡点赞成功!");
    }



}
