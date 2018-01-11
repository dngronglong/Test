import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.loan.beans.UserBean;
import org.project.loan.mainmag.service.IUserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUser {
    @Resource
    private IUserService userServiceImpl;
    @Test
    public void saveUser(){
        UserBean user=new UserBean();
        user.setName("sadasd");
        userServiceImpl.saveUser(user);
    }
    @Test
    public void getUser(){
        List<UserBean> list=userServiceImpl.findAll();
        System.out.println(list);
    }
}
