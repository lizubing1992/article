package com.sohu.article.controller.cover;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.dto.CommentDetailEntity;
import com.sohu.article.model.ArticleEntity;
import com.sohu.article.service.CoverCommentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/3 17:29
 * @Description:
 */
@RestController
@RequestMapping("article/comment")
public class CoverCommentController {

    @Autowired
    private CoverCommentService commentService;

    @ApiOperation(value="获取文章列表", notes="获取文章列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "coverId", value = "贺卡id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query",defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query",defaultValue = "20")})
    @GetMapping("/list")
    public WebResponse<PageResultBean<CommentDetailEntity>> list(Integer coverId,Integer pageNo, Integer pageSize){
        return ResponseBuilder.build(commentService.list(coverId,pageNo,pageSize));
    }


    @ApiOperation(value="新增贺卡评论", notes="新增贺卡评论")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "comment", value = "贺卡评论", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "coverId", value = "贺卡id", required = true, dataType = "int", paramType = "query")})
    @GetMapping("/add")
    public WebResponse<PageResultBean<String>> add(String comment,Integer userId, Integer coverId){
        commentService.addComment(comment,userId,coverId);
        return ResponseBuilder.build("评论添加成功！");
    }



}
