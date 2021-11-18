package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanA {
    private String name;
    private int value;

    public BeanA() {
        System.out.println("Init BeanA");
    }

    private void init() {
        System.out.println("INIT: BeanA");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanA");
    }
}
