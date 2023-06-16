package ex05.problem;

public class Point3D extends Point {

	private int z;
	
	public Point3D(int x, int y) {
		super(x, y);
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
		
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}
	
	@Override
	public String toString() {
		String str = "("+getX()+","+getY()+","+z+")의 점";
		return str;
	}



}











