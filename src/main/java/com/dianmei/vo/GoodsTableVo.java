package com.dianmei.vo;/**
 * ${DESCRIPTION}
 *
 * @author xianglu.Wang
 * @creatDate 2018-06-22-16:09
 */

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.dianmei.dto.TableViewDto;
import com.dianmei.model.Goods;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Getter;
import lombok.Setter;

/**
 *@ClassName GoodsTableVo
 *@Description TODO
 *@Author lout
 *@Date 2018/6/22 16:09
 *@Version 1.0
 **/
@Getter
@Setter
public class GoodsTableVo extends TableViewVo {

    private String goodsNo;
    private String goodsName;
    private String barCode;
    private String brandCode;
    private boolean isSale;
    private boolean isBook;
    private String storageCode;
    private String supplierCode;

    public GoodsTableVo getParams() {
        if(!StringUtils.isEmpty(getFilter())) {
            GoodsTableVo tableVo = JSON.parseObject(getFilter(), GoodsTableVo.class);
            this.goodsNo = tableVo.getGoodsNo();
            this.goodsName = tableVo.getGoodsName();
            this.barCode = tableVo.getBarCode();
            this.brandCode = tableVo.getBarCode();
            this.isSale = tableVo.isSale();
            this.isBook = tableVo.isBook();
            this.storageCode = tableVo.getStorageCode();
            this.supplierCode = tableVo.getSupplierCode();
        }
        return this;
    }
}
