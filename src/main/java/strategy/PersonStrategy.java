package strategy;

import factory.Person;
import factory.impl.Man;
import factory.impl.Woman;

/**
 * @program: design_mode
 * @description: 人策略模式
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:38
 **/
public class PersonStrategy {
    private static final String MAN = "man";
    private static final String WOMAN = "woman";
    private Person person;

    public PersonStrategy(Person person){
        this.person = person;
    }

    public PersonStrategy(String o){
        if(o.equalsIgnoreCase(MAN)){
            this.person = new Man();
        }else if(o.equalsIgnoreCase(WOMAN)){
            this.person = new Woman();
        }
    }

    /**
     * 人类行为
     */
    public void personAction(){
        person.run();
        person.sleep();
    }
}

