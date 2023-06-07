package ex04.example.this1;

public class Basic {

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
//		s1.printX();
		
		s1.setX(15);
		s1.setY(22);
		
		s1.setX(17);
		s1.setY(88);
		
//		System.out.println("x="+s1.x+", y="+s1.y);
		System.out.println("x="+s1.getX()+", y="+s1.getY());
		
		Sample s2 = new Sample(50, 77);
		System.out.println("x="+s2.getX()+", y="+s2.getY());

	}

}
