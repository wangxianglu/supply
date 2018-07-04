package com.dianmei.dao;

import com.dianmei.core.Mapper;
import com.dianmei.model.Staff;
import org.apache.ibatis.annotations.Select;

public interface StaffMapper extends Mapper<Staff> {

    @Select("select * from sm_staff where STAFFINFOID = #{userId}")
    Staff findByUserId(Integer userId);

}