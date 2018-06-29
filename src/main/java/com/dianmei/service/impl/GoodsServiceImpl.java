package com.dianmei.service.impl;

import com.dianmei.core.AbstractService;
import com.dianmei.dao.GoodsMapper;
import com.dianmei.dto.TableViewDto;
import com.dianmei.model.Goods;
import com.dianmei.service.GoodsService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 产品实现
 * @Author wangxianglu
 * @Date 2018-06-29
 * @Version 1.0
 * Created by wangxianglu on 2018/06/21.
 */
@Service
@Transactional
public class GoodsServiceImpl extends AbstractService<Goods> implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    public List<Goods> findGoodsList(int start, int end, String goodsNo, String goodsName,
                                String barCode, String brandCode, String storageCode,
                                String supplierCode, boolean isBook, boolean isSale) {
        PageHelper.offsetPage(start, end);  // 使用分页插件进行分页
        PageHelper.orderBy("goods_id desc"); // 根据goodsID 进行排序
        return baseSelect(goodsNo, goodsName, barCode, brandCode, storageCode, supplierCode, isBook, isSale, false);
    }


    /**
     *  基础查询(包含各个筛选条件)goods 表数据
     * @Author wangxianglu
     * @Date 2018-06-29
     * @version 1.0
     * @param goodsNo 产品编码
     * @param goodsName 产品名称
     * @param barCode 条码
     * @param brandCode 品牌编码
     * @param storageCode 仓库编码
     * @param supplierCode 供应商公司编码
     * @param isBook 是否可采购(上架状态)
     * @param isSale 是否可订购
     * @param isCard 是否是卡
     * @return 产品集合
     */
    public List<Goods> baseSelect(String goodsNo, String goodsName, String barCode, String brandCode, String storageCode,
                                      String supplierCode, boolean isBook, boolean isSale, boolean isCard) {
        Map<String, Object> param = new HashMap<>();
        param.put("goodsNo", goodsNo);
        param.put("goodsName", goodsName);
        param.put("barCode", barCode);
        param.put("brandCode", brandCode);
        param.put("isBook", isBook);
        param.put("isSale", isSale);
        param.put("storageCode", storageCode);
        param.put("supplierCode", supplierCode);
        param.put("isCard", isCard);
        return goodsMapper.selectGoods(param);
    }

    public TableViewDto<Goods> pageList() {
        return null;
    }
}
