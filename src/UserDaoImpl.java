public class UserDaoImpl implements UserDao {
    @Override
    public boolean queryUsernameAndPassword(String username, String password) {
        System.out.println("query username and password success");
        return true;
    }
}
