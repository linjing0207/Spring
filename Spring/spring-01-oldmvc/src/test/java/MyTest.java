import com.linjing.dao.UserDaoImpl;
import com.linjing.dao.UserDaoMySQLImpl;
import com.linjing.dao.UserDaoOracleImpl;
import com.linjing.service.UserService;
import com.linjing.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层他们不需要接触。
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
