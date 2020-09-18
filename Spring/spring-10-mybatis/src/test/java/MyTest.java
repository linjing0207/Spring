import com.linjing.mapper.UserMapper;
import com.linjing.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void testGetUsers() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");  //1
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);  //2
        SqlSession sqlSession = sessionFactory.openSession();  //3

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
