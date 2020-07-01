package demo.beanPostProcessor;

import org.springframework.stereotype.Component;
import java.lang.annotation.*;

@Target({ElementType.FIELD}) //声明应用在属性上
@Retention(RetentionPolicy.RUNTIME) //运行期生效
@Documented //Java Doc
@Component
public @interface MyAnnotation {
    String value() default "";
}