package org.project.loan.mainmag.service;

import org.project.loan.beans.UserBean;

import java.util.List;

public interface IUserService {
    void saveUser(UserBean bean);
    List<UserBean> findAll();
}
