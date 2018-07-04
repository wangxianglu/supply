package com.dianmei.service.impl;

import com.dianmei.dao.CompanyMapper;
import com.dianmei.enums.CompanyType;
import com.dianmei.model.Company;
import com.dianmei.service.CompanyService;
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
public class CompanyServiceImpl extends AbstractService<Company> implements CompanyService {

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public List<Company> findByIdsAndType(CompanyType companyType, Set<Integer> ids) {

        return companyMapper.findByIdsAndType(companyType.getValue(), ids);
    }
}
