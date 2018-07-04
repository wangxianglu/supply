package com.dianmei.service;

import com.dianmei.core.Service;
import com.dianmei.model.UserPermission;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by wangxianglu on 2018/07/03.
 */
public interface UserPermissionService extends Service<UserPermission> {

    List<UserPermission> findByUser(Integer userId);
}
