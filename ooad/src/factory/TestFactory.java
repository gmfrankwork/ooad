package factory;

public class TestFactory {

	public static void main(String[] args) {
		
		Sender s = SenderFactory.getSender("sto");
		
		s.send();
	}
}
