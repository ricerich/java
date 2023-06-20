package ex05.problem;

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");		
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");		
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");		
	}
}

public abstract class Shape 
{
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // 링크 연결

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}
