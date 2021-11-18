package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanE {
    private String name;
    private int value;

    public BeanE() {
        System.out.println("Init BeanE");
    }

    private void init() {
        System.out.println("INIT: BeanE");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanE");
    }
}
