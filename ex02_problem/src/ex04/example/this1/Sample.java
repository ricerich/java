package ex04.example.this1;

public class Sample 
{
	private int x;
	private int y;
	
	public Sample()
	{
//		x = 10;
//		y = 20;
		
	}
	
	public Sample(int x, int y)
	{
		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		//printX();
		return x;
	}
	public int getY() {
		return y;
	}
	
	private void printX()
	{
		System.out.println(x);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
