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
    private String brandName;
    private boolean isSale;
    private boolean isBook;
    private String storageName;
    private String supplierName;

    public GoodsTableVo getParams() {
        if(!StringUtils.isEmpty(getFilter())) {
            GoodsTableVo tableVo = JSON.parseObject(getFilter(), GoodsTableVo.class);
            this.goodsNo = tableVo.getGoodsNo();
            this.goodsName = tableVo.getGoodsName();
            this.barCode = tableVo.getBarCode();
            this.brandName = tableVo.getBrandName();
            this.isSale = tableVo.isSale();
            this.isBook = tableVo.isBook();
            this.storageName = tableVo.getStorageName();
            this.supplierName = tableVo.getSupplierName();
        }
        return this;
    }

    /**
     * 针对 产品列表做的排序规则
     * @return
     */
    public String pageHelperSortRule() {

        if(getSort().equals("goodsNo")) {
            return "goods_no " + getOrder();
        } else if (getSort().equals("goodsName")) {
            return "goods_name " + getOrder();
        } else if (getSort().equals("barCode")) {
            return "bar_code " + getOrder();
        } else if (getSort().equals("brandName")) {
            return "brand_name " + getOrder();
        } else if (getSort().equals("storageName")) {
            return "storage_name " + getOrder();
        } else if (getSort().equals("supplierName")) {
            return "supplier_name " + getOrder();
        } else if (getSort().equals("storePrice")) {
            return "store_price " + getOrder();
        } else if (getSort().equals("attributeName")) {
            return "attribute_name " + getOrder();
        } else if (getSort().equals("isSale")) {
            return "is_sale " + getOrder();
        } else if (getSort().equals("isBook")) {
            return "is_book " + getOrder();
        } else if (getSort().equals("goodsStatus")) {
            return "goods_status " + getOrder();
        } else {
            return "goods_id desc"; //默认使用ID 进行倒序
        }
    }
}
