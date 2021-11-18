package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanB {
    private String name;
    private int value;

    public BeanB() {
        System.out.println("Init BeanB");
    }

    private void init() {
        System.out.println("INIT: BeanB");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanB");
    }
}
