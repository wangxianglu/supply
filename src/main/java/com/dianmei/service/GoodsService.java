package com.dianmei.service;
import com.dianmei.dao.GoodsMapper;
import com.dianmei.model.Goods;
import com.dianmei.core.Service;

import java.util.List;


/**
 * Created by wangxianglu on 2018/06/21.
 */
public interface GoodsService extends Service<Goods> {

    /**
     * 条件查询 产品 翻页,
     * @param start 起始页数
     * @param end 结束页
     * @param goodsNo 产品编号
     * @param goodsName 产品名称
     * @param barCode 条码
     * @param brandCode 公司编码 或名称
     * @param storageCode 仓库编码或名称
     * @param supplierCode 供应商编码或名称
     * @param isBook 是否可订购
     * @param isSale 是否售卖
     * @param sortRule 排序规则
     * @return 筛选排序后的产品集合
     */
    List<Goods> findGoodsList(int start, int end, String goodsNo, String goodsName, String barCode, String brandCode, String storageCode,
                         String supplierCode, boolean isBook, boolean isSale, String sortRule);
}
