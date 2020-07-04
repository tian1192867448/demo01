package com.huike.dao;

import com.huike.po.Umsadmin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UmsadminDao {

    @Select("select * from ums_admin")
    List<Umsadmin> queryAllUmsadmin();
}
