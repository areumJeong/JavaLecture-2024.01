package mysql.sec06_user;

public class UserTest {

	public static void main(String[] args) {
		UserService userSvc = new UserServiceMySQLImpl();
		
		User user = new User("admin", "1234", "관리자", "admin@naver.com");

	}

}
