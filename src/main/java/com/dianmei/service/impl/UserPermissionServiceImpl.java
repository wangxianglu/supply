package com.dianmei.service.impl;


import com.dianmei.core.AbstractService;
import com.dianmei.dao.UserPermissionMapper;
import com.dianmei.model.UserPermission;
import com.dianmei.service.UserPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangxianglu on 2018/07/03.
 */
@Service
@Transactional
public class UserPermissionServiceImpl extends AbstractService<UserPermission> implements UserPermissionService {

    @Resource
    private UserPermissionMapper userPermissionMapper;

    @Override
    public List<UserPermission> findByUser(Integer userId) {
        return userPermissionMapper.findByUser(userId);
    }
}
