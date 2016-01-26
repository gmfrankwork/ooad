package proxy;

public class UserDaoImplProxy implements IUserDao {

	private IUserDao userDao;

	public UserDaoImplProxy(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add() {
		checkAdmin();
		userDao.add();
		
	}

	@Override
	public void delete() {
		checkAdmin();
		userDao.delete();
		
	}
	
	public void checkAdmin(){
		System.out.println("UserDaoImplProxy.checkAdmin()");
	}
	
}
