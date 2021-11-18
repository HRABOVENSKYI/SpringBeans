package ua.lviv.iot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.lviv.iot.components.Config;
import ua.lviv.iot.components.General;
import ua.lviv.iot.components.Parent;
import ua.lviv.iot.config.FirstConfig;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FirstConfig.class, General.class, Config.class);

//        BeanA beanA = context.getBean("getBeanAFromBeanB", BeanA.class);
//        System.out.println(beanA);
//
//        BeanF beanF = context.getBean(BeanF.class);
//        System.out.println(beanF);

        context.getBean(Parent.class).print();
        context.getBean(Parent.class).print();
        context.getBean(Parent.class).print();
    }
}
