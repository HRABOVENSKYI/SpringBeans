package ua.lviv.iot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import ua.lviv.iot.beans.BeanB;
import ua.lviv.iot.beans.BeanC;
import ua.lviv.iot.beans.BeanD;
import ua.lviv.iot.beans.BeanF;

@Configuration
@PropertySource("application.properties")
public class SecondConfig {

    @Value("${beanB.name}")
    private String beanBName;
    @Value("${beanB.value}")
    private int beanBValue;
    @Value("${beanC.name}")
    private String beanCName;
    @Value("${beanC.value}")
    private int beanCValue;
    @Value("${beanD.name}")
    private String beanDName;
    @Value("${beanD.value}")
    private int beanDValue;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @DependsOn({"getBeanD", "getBeanB"})
    public BeanC getBeanC() {
        return new BeanC(beanCName, beanCValue);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanB getBeanB() {
        return new BeanB(beanBName, beanBValue);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public BeanF getBeanF() {
        return new BeanF("beanF", 1111);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD getBeanD() {
        return new BeanD(beanDName, beanDValue);
    }
}
