package proxy.demo.jdk;

public class JcyaoServiceImpl implements JcyaoService {
    private String name;
    private int age;

    public JcyaoServiceImpl() {
        super();
    }

    public JcyaoServiceImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showMsg() {
        System.out.println(name + age);
        return "it is ok";
    }
}