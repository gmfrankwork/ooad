package observer;

import java.util.HashSet;
import java.util.Set;

public class Girl {

	private String name;
	
	private String emotion;
	
	private Set<Boy> allBoys;

	public Girl(String name) {
		this.name= name;
		emotion ="unhappy";
		allBoys = new HashSet<Boy>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		
		this.emotion = emotion;
		Emotion e = new Emotion(emotion, this);
		for (Boy boy : allBoys) {
			boy.handEmotion(e);
		}
		
	}

	public Set<Boy> getAllBoys() {
		return allBoys;
	}

	public void setAllBoys(Set<Boy> allBoys) {
		this.allBoys = allBoys;
	}
	public void addBoysFriends(Boy boy){
		allBoys.add(boy);
	}
	
	
}
