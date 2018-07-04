package com.dianmei.service.impl;

import com.dianmei.dao.CompanyMapper;
import com.dianmei.model.Company;
import com.dianmei.service.CompanyService;
import com.dianmei.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wangxianglu on 2018/07/04.
 */
@Service
@Transactional
public class CompanyServiceImpl extends AbstractService<Company> implements CompanyService {
    @Resource
    private CompanyMapper bmCompanyMapper;

}
