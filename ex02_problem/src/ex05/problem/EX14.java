package ex05.problem;

class Oval13 implements Shape13
{
	private int width;
	private int height;

	public Oval13(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 원입니다.");
	}

	@Override
	public double getArea() {
		return (width/2) * (height/2) * PI;
	}
	
}

class Rect13 implements Shape13
{
	private int width;
	private int height;
	
	public Rect13(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

public class EX14 {
	public static void main(String[] args) 
	{
		Shape13[] list = new Shape13[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle13(10); // 반지름이 10인 원 객체
		list[1] = new Oval13(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect13(10, 40); // 10x40 크기의 사각형

		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());
	}
}
