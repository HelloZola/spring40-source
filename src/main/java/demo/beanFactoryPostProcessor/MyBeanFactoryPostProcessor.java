package demo.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import utils.PrintContolUtils;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        PrintContolUtils.print(PrintContolUtils.Bean, "调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
        BeanDefinition bd = beanFactory.getBeanDefinition("pojoTest");
        PrintContolUtils.print(PrintContolUtils.Bean, "************************************");
        PrintContolUtils.print(PrintContolUtils.Bean,bd.toString());
        PrintContolUtils.print(PrintContolUtils.Bean, "************************************");
        PrintContolUtils.print(PrintContolUtils.Bean, "属性值============" + bd.getPropertyValues().toString());
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("name")) {
            pv.addPropertyValue("name", "把名字修改一下");
        }
        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }

}
