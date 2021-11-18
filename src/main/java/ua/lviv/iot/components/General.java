package ua.lviv.iot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.lviv.iot.beans.BeanA;

import java.util.List;

@Component
public class General implements IsComponent {

    private final List<BeanA> beanA;

    public General(List<BeanA> beanA) {
        this.beanA = beanA;
    }

    public void printBeanAs() {
        System.out.println(beanA);
    }
}
