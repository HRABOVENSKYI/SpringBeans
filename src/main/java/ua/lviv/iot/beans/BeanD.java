package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanD {
    private String name;
    private int value;

    public BeanD() {
        System.out.println("Init BeanD");
    }

    private void init() {
        System.out.println("INIT: BeanD");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanD");
    }
}
