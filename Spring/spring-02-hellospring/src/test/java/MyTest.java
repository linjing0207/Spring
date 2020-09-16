import com.linjing.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        //ClassPathXmlApplicationContext -> ... -> ConfigurableApplicationContext -> ApplicationContext
        //ClassPathXmlApplicationContext: ApplicationContext的一个实现类，通过配置文件获取
        //AnnotationConfigApplicationContext: 通过注解获取
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们现在的对象都在spring中管理了,我们要使用就直接从里面取出来
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
