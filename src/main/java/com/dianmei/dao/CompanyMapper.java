package com.dianmei.dao;

import com.dianmei.core.Mapper;
import com.dianmei.model.Company;

import java.util.List;
import java.util.Set;

public interface CompanyMapper extends Mapper<Company> {

    List<Company> findByIdsAndType(int companyType, Set<Integer> ids);
}