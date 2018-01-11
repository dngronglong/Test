package org.project.loan.mainmag.service.impl;

import org.project.loan.beans.UserBean;
import org.project.loan.mainmag.dao.IUserDao;
import org.project.loan.mainmag.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDaoImpl;
    public void saveUser(UserBean bean) {
        userDaoImpl.saveUser(bean);
    }

    public List<UserBean> findAll() {
        return userDaoImpl.getUser();
    }
}
