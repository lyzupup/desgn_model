package factory.impl;

import factory.Person;

/**
 * @program: design_mode
 * @description: 人的工厂类
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:33
 **/
public class PersonFactory {

    private static final String MAN = "man";
    private static final String WOMAN = "woman";

    public Person getPerson(String o){
        if(o.equalsIgnoreCase(MAN)){
            return new Man();
        }else if(o.equalsIgnoreCase(WOMAN)){
            return new Woman();
        }
        return null;
    }
}
