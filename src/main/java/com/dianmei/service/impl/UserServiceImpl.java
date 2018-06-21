package com.dianmei.service.impl;

import com.dianmei.dao.UserMapper;
import com.dianmei.model.User;
import com.dianmei.service.UserService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/21.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
