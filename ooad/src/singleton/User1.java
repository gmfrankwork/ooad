package singleton;
/**
 * 懒汉
 * @author douha
 *
 */
public class User1 {
private static User1 user1 = null;
	
	private User1(){}
	
	public static synchronized User1 getInstance(){
		
		return  user1==null ? user1 = new User1():user1;
	}

	public static void main(String[] args) {
		User1 user1 = User1.getInstance();
		User1 user2 = User1.getInstance();
		System.out.println(user1 == user2);
	}
}
