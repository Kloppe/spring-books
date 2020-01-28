import org.example.config.MainConfigOfFilter;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program SpringBooks
 * @description: 过滤注解测试
 * @author: mf
 * @create: 2020/01/28 22:23
 */

public class IOCTest_Filter {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfFilter.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
