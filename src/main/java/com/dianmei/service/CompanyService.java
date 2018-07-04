package com.dianmei.service;

import com.dianmei.core.Service;
import com.dianmei.enums.CompanyType;
import com.dianmei.model.Company;

import java.util.List;
import java.util.Set;


/**
 * Created by wangxianglu on 2018/07/04.
 */
public interface CompanyService extends Service<Company> {

    List<Company> findByIdsAndType(CompanyType companyType, Set<Integer> ids);

}
