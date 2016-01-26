package observer;

public class Emotion {

	private String emotion;
	
	private Object resource;

	

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public Object getResource() {
		return resource;
	}

	public void setResource(Object resource) {
		this.resource = resource;
	}

	public Emotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emotion(String emotion, Object resource) {
		super();
		this.emotion = emotion;
		this.resource = resource;
	}

	
	
}
