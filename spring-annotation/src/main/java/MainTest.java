import org.example.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program SpringBooks
 * @description: 主测试类
 * @author: mf
 * @create: 2020/01/26 16:49
 */

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
