package com.sohu.article.base;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by administrator on 2018/9/20.
 */
@Api("分页返回Bean")
public class PageResultBean<T> {
    @ApiModelProperty("业务数据模型Bean")
    private List<T> list;

    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public PageResultBean() {
    }

    public PageResultBean(List<T> list) {
        this.list = list;
    }

    public PageResultBean(List<T> list, Integer total) {
        this.list = list;
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
