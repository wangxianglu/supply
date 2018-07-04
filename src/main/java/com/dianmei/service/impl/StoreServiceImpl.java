package com.dianmei.service.impl;

import com.dianmei.dao.StoreMapper;
import com.dianmei.model.Store;
import com.dianmei.service.StoreService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wangxianglu on 2018/07/04.
 */
@Service
@Transactional
public class StoreServiceImpl extends AbstractService<Store> implements StoreService {
    @Resource
    private StoreMapper bmStoreMapper;

}
