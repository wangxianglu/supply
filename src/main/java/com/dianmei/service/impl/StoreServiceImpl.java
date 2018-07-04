package com.dianmei.service.impl;

import com.dianmei.dao.StoreMapper;
import com.dianmei.model.Store;
import com.dianmei.service.StoreService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;


/**
 * Created by wangxianglu on 2018/07/04.
 */
@Service
@Transactional
public class StoreServiceImpl extends AbstractService<Store> implements StoreService {
    @Resource
    private StoreMapper storeMapper;

    @Override
    public List<Store> findByIds(Set<Integer> ids) {
        StringBuffer idsStr = new StringBuffer();
        for(Integer id : ids) {
            idsStr.append(id + ",");
        }
        return storeMapper.selectByIds(idsStr.toString());
    }

}
