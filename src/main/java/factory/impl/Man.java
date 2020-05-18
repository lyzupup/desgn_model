package factory.impl;

import factory.Person;

/**
 * @program: design_mode
 * @description: 男人
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:27
 **/
public class Man implements Person {

    public void run() {
        run();
        sleep();
        System.out.println("男人跑的快");
    }

    public void sleep() {
        System.out.println("男人总是睡不着");
    }
}

