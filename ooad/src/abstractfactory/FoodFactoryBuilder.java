package abstractfactory;


public class FoodFactoryBuilder {
	public static  FoodFactory getSender(String type){
		if("bread".equals(type)){
			return new BreadFactory();
		}else if("shouzhuabin".equals(type)){
			return new ShouZhuaBinFactory();
		}
		return null;
	}
}
