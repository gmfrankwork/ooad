package abstractfactory;

public class Bread implements Food {

	@Override
	public void createFood() {
		
		System.out.println("Bread.createFood()");
		
	}

}
