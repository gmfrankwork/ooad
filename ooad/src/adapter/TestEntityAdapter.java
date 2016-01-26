package adapter;

public class TestEntityAdapter {

	public static void main(String[] args) {
		Source source = new Source();  
        Targetable target = new EntityAdpapter(source);  
        target.method1();  
        target.method2(); 
	}
}
