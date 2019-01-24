package com.sohu.article.controller.cover;

import com.sohu.article.base.PageResultBean;
import com.sohu.article.base.ResponseBuilder;
import com.sohu.article.base.WebResponse;
import com.sohu.article.model.CoverWishesEntity;
import com.sohu.article.service.CoverWishService;
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
 * @Date: 2019/1/7 16:34
 * @Description:
 */
@Api(value = "寄语相关",description = "寄语相关")
@RestController
@RequestMapping("/article/wish")
public class CoverWishController {


    @Autowired
    private CoverWishService coverWishService;

    @ApiOperation(value = "寄语列表", notes = "寄语列表")
    @GetMapping("/list")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "wishType", value = "寄语类型 birthday 生日 lantern 元宵  lover情人节 new_year_eve除夕 spring春节", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页数", required = false, dataType = "int", defaultValue = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的大小", required = false, dataType = "int", defaultValue = "20", paramType = "query")})
    public WebResponse<PageResultBean<CoverWishesEntity>> getList(String wishType, Integer pageNo, Integer pageSize) {
        return ResponseBuilder.build(coverWishService.getListByType(wishType, pageSize,pageNo));
    }
}
