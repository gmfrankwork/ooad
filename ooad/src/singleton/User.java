package singleton;
//饿汉式
public class User {
	
	private static User user = new User();
	
	private User(){}
	
	public static synchronized User getInstance(){
		return user;
	}

	public static void main(String[] args) {
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		System.out.println(user1 == user2);
	}
}
