package com.kyupid.pageingdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM sample_employee")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userGender", column = "user_gender"),
            @Result(property = "departmentCode", column = "department_code")
    })
    List<EmployeeEntity> findAll();
}
