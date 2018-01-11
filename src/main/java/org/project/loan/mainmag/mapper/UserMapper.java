package org.project.loan.mainmag.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.UserBean;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user")
    @Results({@Result(property = "name",column = "name")})
    List<UserBean> findAllUser();
}
