package factory.impl;

import factory.Person;
/**
 * @program: design_mode
 * @description: 女人
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:29
 **/
public class Woman implements Person {

    public void run() {
        System.out.println("女的跑步擦玻璃");
    }

    public void sleep() {
        System.out.println("女的白天也睡");
    }
}
