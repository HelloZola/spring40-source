package example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import utils.PrintContolUtils;

@Aspect
@Component
public class TransactionDemo {

    @Pointcut("execution(* example.aspect.UserServiceImpl.addUser(..))")
    private void pointCutMethod() {

    }

    // 前置通知
    @Before("pointCutMethod()")
    public void startTransaction() {
        PrintContolUtils.print(PrintContolUtils.Aop, "begin transaction ");
    }

    // 后置通知
    @AfterReturning(pointcut = "pointCutMethod()")
    public void commitTransaction() {
        PrintContolUtils.print(PrintContolUtils.Aop, "commit transaction ");
    }

    // 环绕通知
    @Around("pointCutMethod()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        PrintContolUtils.print(PrintContolUtils.Aop, "begin transaction");
        joinPoint.proceed();
        PrintContolUtils.print(PrintContolUtils.Aop, "commit transaction");
    }

    //@AfterThrowing("pointCutMethod()")
    /*@AfterThrowing(throwing="ex",pointcut="pointCutMethod()")
    public void handerException(Throwable ex){
		System.out.println("目标方法中抛出的异常:"+ex);  
        System.out.println("模拟抛出异常后的增强处理...");  
	}*/

}
