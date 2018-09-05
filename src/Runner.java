
public class Runner {
	
	public static void main(String[] args ) 
	{
	
		Test t = new Test(30, 60);
		
		System.out.println(t.addition(5, 10));
		
		t.banana();
		
		Test s = new Test();
		
		s.banana();
		
		Test d = new DifficultTest(345,356,100);
		d.banana();
	}

}
