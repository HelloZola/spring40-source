package aspect;

import bean.ArgBean;
import bean.Person;
import com.alibaba.fastjson.JSON;
import example.aspect.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {

    @Test
    public void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        ArgBean argBean = new ArgBean();
        argBean.setArg1("arg1Test");
        Person person = userService.getResult(argBean);
        System.out.println(JSON.toJSONString(person));
    }
}
