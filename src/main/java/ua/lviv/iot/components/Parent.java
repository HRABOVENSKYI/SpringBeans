package ua.lviv.iot.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Parent {

    private final IsComponent isComponent;

    public Parent(@Qualifier("a_nother") IsComponent isComponent) {
        this.isComponent = isComponent;
    }

    public void print() {
        System.out.println(this.hashCode());
        isComponent.printBeanAs();
    }
}
