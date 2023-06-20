package ex05.problem;

public class Circle13 implements Shape13 {
	
	private int radius;

	public Circle13(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다");
	}

	@Override
	public double getArea() 
	{
		return radius*radius*PI;
	}

}
