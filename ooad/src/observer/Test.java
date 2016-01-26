package observer;

public class Test {

	public static void main(String[] args) {
		Girl g1=new Girl("范冰冰");
		//Girl g2=new Girl("章子怡");
		Boy b1=new Boss("叶加飞");
		Boy b2=new Loser("吴广东");
		
		g1.addBoysFriends(b1);
		g1.addBoysFriends(b2);
		
		g1.setEmotion("unhappy");
		
	}
}
