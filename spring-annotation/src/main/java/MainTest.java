import org.example.bean.Person;
import org.example.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program SpringBooks
 * @description: 主测试类
 * @author: mf
 * @create: 2020/01/26 16:49
 */

public class MainTest {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person);
        ApplicationContext context =  new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = context.getBeanNamesForType(Person.class);
        for (String s : namesForType) {
            System.out.println(s);
        }
    }
}
