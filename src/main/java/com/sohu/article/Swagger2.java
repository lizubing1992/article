package com.sohu.article;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by administrator on 2018/9/14.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createArticleApi() {
        return  (new Docket(DocumentationType.SWAGGER_2))
                .apiInfo(this.apiInfo("文章相关的API"))
                .enable(true)
                .groupName("article")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sohu.article.controller.article"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket createCoverApi() {
       return  (new Docket(DocumentationType.SWAGGER_2))
                .apiInfo(this.apiInfo("贺卡相关的API"))
                .enable(true)
                .groupName("card")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sohu.article.controller.cover"))
                .paths(PathSelectors.any()).build();

    }
    private ApiInfo apiInfo(String title) {
        return new ApiInfoBuilder()
                .title(title)
                .termsOfServiceUrl("http://localhost:8089")
                .version("1.0")
                .build();
    }
}
