package factory;

public class SenderFactory {

	public static  Sender getSender(String type){
		if("ems".equals(type)){
			return new EmsSender();
		}else if("sto".equals(type)){
			return new StoSender();
		}
		return null;
	}
}
