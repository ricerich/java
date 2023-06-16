package ex05.problem;

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}
	
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 || y<0)
			super.move(0,0);
		
	}
	
	protected void move(int x, int y) {
		if(x>0 && y>0)
			super.move(x,y);
		else
			return;
	}
	
	@Override
	public String toString() {
		String str = "("+getX()+","+getY()+")의 점";
		return str;
	}


}
