package com.dianmei.dao;

import com.dianmei.core.Mapper;
import com.dianmei.model.UserPermission;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserPermissionMapper extends Mapper<UserPermission> {

    @Select("select * from sm_user_permission where user_id = #{userId}")
    @ResultMap("BaseResultMap")
    List<UserPermission> findByUser(Integer userId);
}