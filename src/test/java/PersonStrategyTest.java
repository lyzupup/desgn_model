import org.junit.Test;
import strategy.PersonStrategy;

/**
 * @program: design_mode
 * @description: 策略模式测试类
 * @author: xiaomanixi 小码blog
 * @create: 2020-05-19 00:57
 **/
public class PersonStrategyTest {

    @Test
    public void Test1(){
        PersonStrategy man = new PersonStrategy("man");
        System.out.println("策略模式##男人行为");
        man.personAction();
    }
}

