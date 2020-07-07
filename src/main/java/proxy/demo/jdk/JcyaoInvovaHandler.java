package proxy.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JcyaoInvovaHandler implements InvocationHandler {

    /**
     * 业务实体类
     */
    private Object target;

    public JcyaoInvovaHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(System.currentTimeMillis() + target.getClass().getName() + "." + method.getName() + "开始");
        Object obj = method.invoke(target, args);//通过反射调取业务的目标方法
        System.out.println(System.currentTimeMillis() + target.getClass().getName() + "." + method.getName() + "结束");
        return obj;
    }
}