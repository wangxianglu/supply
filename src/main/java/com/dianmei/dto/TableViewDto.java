package com.dianmei.dto;

import java.util.List;

/**
 *  页面中 使用bootstrap table 匹配的 数据模型
 *@ClassName TableViewDto
 *@Description TODO
 *@Author lout
 *@Date 2018/6/21 14:59
 *@Version 1.0
 **/
public class TableViewDto<T> {

    private List<T> rows;
    private long total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public TableViewDto(List<T> rows, long total){
        this.rows = rows;
        this.total = total;
    }
}
