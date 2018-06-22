package com.dianmei.service;
import com.dianmei.dao.GoodsMapper;
import com.dianmei.model.Goods;
import com.dianmei.core.Service;

import java.util.List;


/**
 * Created by wangxianglu on 2018/06/21.
 */
public interface GoodsService extends Service<Goods> {

    List<Goods> findList(int start, int end);
}
