package com.sohu.article.controller.article;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.model.ArticleEntity;
import com.sohu.article.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @author  lizubing1992
 */
@Api(value = "文章相关",description = "文章相关")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation(value="获取文章详情", notes="获取文章详情")
    @ApiImplicitParam(name = "id", value = "客户id", required = true, dataType = "string", paramType = "query")
    @GetMapping("/index")
    public WebResponse<ArticleEntity> index(String id){
        return ResponseBuilder.build(articleService.getIndex(id));
    }

    @ApiOperation(value="获取文章列表", notes="获取文章列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "articleType", value = "文章类型", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "当前页", required = false, dataType = "int", paramType = "query",defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页面值", required = false, dataType = "int", paramType = "query",defaultValue = "20")})
    @GetMapping("/list")
    public WebResponse<PageResultBean<ArticleEntity>> list(String articleType, Integer pageNo, Integer pageSize){
        return ResponseBuilder.build(articleService.list(articleType,pageNo,pageSize));
    }
}
