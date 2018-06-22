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
    private String companyId;
    private String isSale;
    private String isBook;
    private String sendHouseId;
    private String sendSupplierId;

    public GoodsTableVo getParams() {
        if(!StringUtils.isEmpty(getFilter())) {
            GoodsTableVo tableVo = JSON.parseObject(getFilter(), GoodsTableVo.class);
            this.goodsNo = tableVo.getGoodsNo();
            this.goodsName = tableVo.getGoodsName();
            this.barCode = tableVo.getBarCode();
            this.companyId = tableVo.getCompanyId();
            this.isSale = tableVo.getIsSale();
            this.isBook = tableVo.getIsBook();
            this.sendHouseId = tableVo.getSendHouseId();
            this.sendSupplierId = tableVo.getSendSupplierId();
        }
        return this;
    }
}
