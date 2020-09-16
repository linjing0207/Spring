import com.linjing.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //默认通过无参构造器创建对象
        User user = (User) context.getBean("u5");
        user.show();
    }
}
