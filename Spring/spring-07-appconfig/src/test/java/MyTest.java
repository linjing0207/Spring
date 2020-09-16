import com.linjing.config.MyConfig;
import com.linjing.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //纯注解去实现的，注解配置类
        //如果完全使用配置类方式去做，只能通过AnnotationConfigApplicationContext来获取容器，通过配置类的class对象。
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("getUser"); //方法名，bean id
        System.out.println(user.getName());
    }
}
