import factory.Person;
import factory.impl.PersonFactory;
import org.junit.Test;

/**
 * @program: design_mode
 * @description: 工厂模式测试类
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:56
 **/
public class PersonFactoryTest {

    @Test
    public void test1(){
        PersonFactory personFactory = new PersonFactory();
        Person man = personFactory.getPerson("man");
        System.out.println("工厂模式##男人跑步");
        man.run();
        System.out.println("工厂模式##男人睡觉");
        man.sleep();
    }
}

