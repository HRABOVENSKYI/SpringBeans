package ua.lviv.iot.beans;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BeanC {
    private String name;
    private int value;

    public BeanC() {
        System.out.println("Init BeanC");
    }

    private void init() {
        System.out.println("INIT: BeanC");
    }

    private void destroy() {
        System.out.println("DESTROY: BeanC");
    }
}
