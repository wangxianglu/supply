package com.dianmei.service;
import com.dianmei.model.Store;
import com.dianmei.core.Service;

import java.util.List;
import java.util.Set;


/**
 * Created by wangxianglu on 2018/07/04.
 */
public interface StoreService extends Service<Store> {

    List<Store> findByIds(Set<Integer> ids);

    /*Store findById(Integer id);*/
}
