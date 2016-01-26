package abstractfactory;

public class TestFactory {

	public static void main(String[] args) {
		
		FoodFactory ff = FoodFactoryBuilder.getSender("bread");
		
		Food food = ff.createFoodFactory();
		
		food.createFood();
		
	}
}
