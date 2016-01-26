package observer;

public class Boss implements Boy{

	private String name;
	
	public Boss(String name){
		this.name=name;
	}
	
	public void handEmotion(Emotion e) {
		Girl g=(Girl)e.getResource();
		String emotion=e.getEmotion();
		if(emotion.equals("happy")){
			System.out.println(name+":"+g.getName()+",,我陪你去买房子吧！");
		}else{
			System.out.println(name+":"+g.getName()+",我陪你去买钻戒吧!!");
		}
	}
}
