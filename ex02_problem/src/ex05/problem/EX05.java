package ex05.problem;

public class EX05 {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");		
		
		ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp1 = new ColorPoint(10, 10);
		cp1.setXY(5, 5);
		cp1.setColor("RED");
		System.out.println(cp1.toString() + "입니다.");
	}
	
}

class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint() {
		//super(0,0);
		this(0,0);
		color = "black";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}


	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

//	@Override
//	public String toString() {
//		String str = color+"의 색은 ("+getX()+","+getY()+")의 점";
//		return str;
//	}



	public void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
		
	}
}

