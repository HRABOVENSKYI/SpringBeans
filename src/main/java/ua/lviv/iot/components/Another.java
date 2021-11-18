package ua.lviv.iot.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("a_nother")
public class Another implements IsComponent {

    @Override
    public void printBeanAs() {
        System.out.println("IN ANOTHER");
    }
}
