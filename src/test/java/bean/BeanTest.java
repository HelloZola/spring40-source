package bean;

import demo.beanFactoryPostProcessor.PojoTest;
import demo.beanPostProcessor.Pojo2Test;
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
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PojoTest pojoTest = (PojoTest) applicationContext.getBean("pojoTest");
        System.out.println(pojoTest.getName());
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Pojo2Test pojoTest = (Pojo2Test) applicationContext.getBean("pojo2Test");
        System.out.println(pojoTest.getName());
    }
}
