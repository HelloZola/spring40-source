package proxy.cglib;

public class JcyaoServiceImpl {

    private String name;
    private int age;

    public JcyaoServiceImpl() {
        super();
    }

    public String showMsg() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "it is ok";
    }

    public String showMsg2() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "it is ok too";
    }
}