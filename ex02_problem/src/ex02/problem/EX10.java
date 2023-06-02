package ex02.problem;
import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원1의 중심 (x1,y1)와 반지름(r1)을 입력해주세요>>");
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		double r1 = sc1.nextDouble();
		
		System.out.print("원2의 중심 (x2,y2)와 반지름(r2)을 입력해주세요>>");
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		double r2 = sc1.nextDouble();
		
		double length = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(length > r1+r2)
			System.out.println("두 원은 겹치지 않습니다(밖).");
		else if(length < r1+r2)
			System.out.println("두 원은 겹칩니다(안)");
	}
}








