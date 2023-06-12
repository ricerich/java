package ex04.problem;

public class Circle {
	private double x;
	private double y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getArea()
	{
		return 3.14 * radius * radius;
	}
	
	

	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}

	
}
