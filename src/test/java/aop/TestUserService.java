package aop;

import com.project.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/2/28.
 */
public class TestUserService {
   private ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
         ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testSaveUser(){

        UserService userService = ctx.getBean("userServiceImpl", UserService.class);
        userService.saveUser("海涛");
        userService.updateUser("海涛");
    }


    @After
    public void destory(){
        ctx.close();
    }
}
