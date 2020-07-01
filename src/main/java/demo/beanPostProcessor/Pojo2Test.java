package demo.beanPostProcessor;

import org.springframework.stereotype.Component;

@Component(value = "pojo2Test")
public class Pojo2Test {

    @MyAnnotation("helloVi")
    private String name;

    private int age;

    public String getName() {
        return name;
    }

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
