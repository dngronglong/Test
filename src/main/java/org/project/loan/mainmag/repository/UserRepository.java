package org.project.loan.mainmag.repository;

import org.project.loan.beans.UserBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * extends JpaRepository<UserBean, Long> 
 * UserBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface UserRepository extends JpaRepository<UserBean, Integer>,JpaSpecificationExecutor<UserBean> {

	
}
