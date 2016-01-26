package abstractfactory;

public class ShouZhuaBinFactory implements FoodFactory{

	@Override
	public Food createFoodFactory() {
		return new ShouZhuaBin();
	}

}
