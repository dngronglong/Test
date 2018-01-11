package org.project.loan.mainmag.dao.impl;

import org.project.loan.beans.UserBean;
import org.project.loan.mainmag.dao.IUserDao;
import org.project.loan.mainmag.mapper.UserMapper;
import org.project.loan.mainmag.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository
public class UserDaoImpl implements IUserDao {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserRepository userRepository;

    /**
     * hibernate
     * @param bean
     */
    public void saveUser(UserBean bean) {
        userRepository.save(bean);
    }

    /**
     * mybatis调用
     * @return
     */
    public List<UserBean> getUser() {
        return userMapper.findAllUser();
    }
}
