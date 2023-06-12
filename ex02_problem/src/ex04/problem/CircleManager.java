package ex04.problem;

import java.util.Scanner;

public class CircleManager {

	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			c[i] = new Circle(x, y, radius);
		}
		
//		for(int i=0; i<c.length; i++)
//			c[i].show();
		
		
//		double max = 0.0;
//		int max_index = 0;
//		for(int i=0; i<c.length; i++)
//		{
//			if(max < c[i].getArea())
//			{
//				max = c[i].getArea();
//				max_index = i;
//			}
//		}

		int max_index = 0;
		for(int i=0; i<c.length; i++)
		{
			if(c[max_index].getArea() < c[i].getArea())
			{
				max_index = i;
			}
		}
		
		c[max_index].show();
		
		
		
			
		
	}

}




