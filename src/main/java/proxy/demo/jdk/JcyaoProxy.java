package proxy.demo.jdk;

import org.junit.Test;
import java.lang.reflect.Proxy;

public class JcyaoProxy {

    @Test
    public void proxy() {

        //java动态代理，必须使用接口代理
        JcyaoService js = new JcyaoServiceImpl("jcyao", 25);
        JcyaoInvovaHandler ji = new JcyaoInvovaHandler(js);

        JcyaoService proxy = (JcyaoService) Proxy.newProxyInstance(js
                        .getClass().getClassLoader(),
                js.getClass().getInterfaces(), ji);

        proxy.showMsg();
    }
}