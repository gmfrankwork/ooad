package proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		IUserDao userDao = new UserDaoImpl();
		
		userDao.add();
		userDao.delete();
	
		/**
		 * 在add和delete方法执行之前添加一个方法
		 */
		
	IUserDao userDao1 = new UserDaoImplProxy(new UserDaoImpl());
	
	userDao1.add();
	userDao1.delete();
	}
}
