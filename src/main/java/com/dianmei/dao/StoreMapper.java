package com.dianmei.dao;

import com.dianmei.core.Mapper;
import com.dianmei.model.Store;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StoreMapper extends Mapper<Store> {

    @Select("select * from bm_store where STOREID = #{id}")
    Store findById(Integer id);
}