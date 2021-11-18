package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanF {
    private String name;
    private int value;

    public BeanF() {
        System.out.println("Init BeanF");
    }

    private void init() {
        System.out.println("INIT: BeanF");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanF");
    }
}
