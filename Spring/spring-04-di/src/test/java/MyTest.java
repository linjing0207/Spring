import com.linjing.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s = (Student) context.getBean("student");
        System.out.println(s.toString());
    }

    /*
    * Student{name='小猪佩奇',
    * address=Address{address='杭州'},
    * books=[红楼梦, 水浒传, 三国演义, 西游记],
    * hobbies=[听歌, 打游戏, 看剧],
    * card={
    *   身份证=123,
    *   银行卡=134234
    * },
    * games=[lol, 动物森友会],
    * info={password=123456, url=小猪佩奇, driver=31301260, username=root}, work='null'}
     * */
}
