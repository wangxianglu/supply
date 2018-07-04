package com.dianmei.service.impl;

import com.dianmei.dao.StaffMapper;
import com.dianmei.model.Staff;
import com.dianmei.service.StaffService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wangxianglu on 2018/07/04.
 */
@Service
@Transactional
public class StaffServiceImpl extends AbstractService<Staff> implements StaffService {
    @Resource
    private StaffMapper smStaffMapper;

}
