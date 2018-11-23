import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl init");
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        //dao层查询数据
        System.out.println("调用dao层查询用户名和密码");
        boolean b = userDao.queryUsernameAndPassword(username, password);
        return b;
    }
}
