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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lizubing1992
 * @Date: 2019/1/7 16:34
 * @Description:
 */
@Api(value = "格言相关",description = "格言相关")
@RestController
@RequestMapping("/article/aphorism")
public class CoverAphorismController {


    @Autowired
    private CoverWishService coverWishService;

    @ApiOperation(value = "格言数据", notes = "格言数据")
    @GetMapping("/index")
    public WebResponse<String> getList() {
        CoverWishesEntity entity = coverWishService.selectByRandomAphorism();
        if(entity != null){
            return ResponseBuilder.build(entity.getWishContent());
        }else {
            return ResponseBuilder.build("获取格言数据出错！");
        }
    }
}
