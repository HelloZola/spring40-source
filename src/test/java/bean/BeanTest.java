package bean;

import beanFactoryPostProcessor.PojoTest;
import example.aspect.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userService.addUser();

        PojoTest pojoTest = (PojoTest) applicationContext.getBean("pojoTest");
        System.out.println(pojoTest.getName());
    }
}
