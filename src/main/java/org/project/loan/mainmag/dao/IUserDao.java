package org.project.loan.mainmag.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IUserDao {
    void saveUser(UserBean bean);

    List<UserBean> getUser();
}
