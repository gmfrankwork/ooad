package observer;

public class Loser implements Boy {

	private String name;
	
	public Loser(String name){
		this.name=name;
	}
	
	public void handEmotion(Emotion e) {
		Girl g=(Girl)e.getResource();
		String emotion=e.getEmotion();
		if(emotion.equals("happy")){
			System.out.println(name+":"+g.getName()+",,我陪你去看星星吧！");
		}else{
			System.out.println(name+":"+g.getName()+",,我陪你去看月亮吧！");
		}
	}
}
