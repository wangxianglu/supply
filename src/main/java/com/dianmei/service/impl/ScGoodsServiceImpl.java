package com.dianmei.service.impl;

import com.dianmei.dao.ScGoodsMapper;
import com.dianmei.model.Goods;
import com.dianmei.service.ScGoodsService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wangxianglu on 2018/06/21.
 */
@Service
@Transactional
public class ScGoodsServiceImpl extends AbstractService<Goods> implements ScGoodsService {
    @Resource
    private ScGoodsMapper scGoodsMapper;

}
