package bean;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2018/10/19
 */
public class Person implements Serializable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    @Transactional
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
