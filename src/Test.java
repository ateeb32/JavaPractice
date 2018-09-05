
public class Test {
	
	protected int x;
	protected int y;
	
	public Test(int c, int d)
	{
		x = c;
		y = d;
	}
	public Test()
	{
		
	}
	
	public int addition(int a, int b) {
		
		return a+b;
	}
	
	public void banana() {
		
		System.out.println("The value of x is: " + x +" and the value of y is: " + y);
	}

}
