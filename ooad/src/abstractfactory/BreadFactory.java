package abstractfactory;

public class BreadFactory implements FoodFactory{

	@Override
	public Food createFoodFactory() {
		// TODO Auto-generated method stub
		return new Bread();
	}

}
