package ua.lviv.iot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import ua.lviv.iot.beans.BeanA;
import ua.lviv.iot.beans.BeanB;
import ua.lviv.iot.beans.BeanC;
import ua.lviv.iot.beans.BeanD;

@Configuration
@Import(SecondConfig.class)
public class FirstConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanA getEmptyBeanA() {
        return new BeanA();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanA getBeanA() {
        return new BeanA("Teo", 12);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanA getBeanAFromBeanB(BeanB beanB) {
        return new BeanA(beanB.getName(), beanB.getValue());
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Order(-1)
    public BeanA getBeanAFromBeanBAndBeanCAndBeanD(BeanB beanB, BeanC beanC, BeanD beanD) {
        return new BeanA(beanB.getName() + beanC.getName() + beanD.getName(),
                beanB.getValue() + beanC.getValue() + beanD.getValue());
    }
}
