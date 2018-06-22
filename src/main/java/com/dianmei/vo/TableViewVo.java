package com.dianmei.vo;

import lombok.Getter;
import lombok.Setter;

/**
 *  前端 bootstrap 收集参数使用的 VO
 *@ClassName TableViewVo
 *@Description TODO
 *@Author wangxianglu
 *@Date 2018/6/22 14:58
 *@Version 1.0
 **/
@Getter
@Setter
public abstract class TableViewVo {

    private String search; //查询条件
    private String sort; // 排序属性
    private String order; // 排序方式
    private int offset; // 起始
    private int limit; // 偏移量
    private String filter; //过滤字符串

}
