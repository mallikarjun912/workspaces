package mockdemo;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
