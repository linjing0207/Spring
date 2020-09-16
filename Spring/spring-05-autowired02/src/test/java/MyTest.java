import com.linjing.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person p = context.getBean("person", Person.class);
        p.getCat().shout();
        p.getDog().shout();
    }
}
