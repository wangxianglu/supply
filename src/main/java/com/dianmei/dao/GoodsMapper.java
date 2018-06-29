package com.dianmei.dao;

import com.dianmei.core.Mapper;
import com.dianmei.model.Goods;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;
import java.util.Map;

public interface GoodsMapper extends Mapper<Goods> {


    List<Goods> selectGoods(Map param);
}