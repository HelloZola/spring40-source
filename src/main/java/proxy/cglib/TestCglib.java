package proxy.cglib;

public class TestCglib {

    public static void main(String[] args) {
        JcyaoServiceImplCglib cglib = new JcyaoServiceImplCglib();
        JcyaoServiceImpl jcyaoService = (JcyaoServiceImpl) cglib.getInstance(new JcyaoServiceImpl());
        jcyaoService.showMsg2();
    }
}
