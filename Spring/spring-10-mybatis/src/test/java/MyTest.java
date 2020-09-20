import com.linjing.mapper.UserMapper;
import com.linjing.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class MyTest {
    @Test
    public void testGetUsers() {
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");  //1
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);  //2
//        SqlSession sqlSession = sessionFactory.openSession();  //3
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//
//        sqlSession.close();

        //实现mybatis的内部集成
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUsers2() {
        //实现mybatis的内部集成
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> userList = userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
