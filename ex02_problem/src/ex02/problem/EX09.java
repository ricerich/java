package ex02.problem;
import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원의 중심 (x1,y1)와 반지름(r)을 입력해주세요>>");
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		double r = sc1.nextDouble();
		
		System.out.print("한점 (x2,y2)을 입력해주세요>>");
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		
		double length = 0.0;
		length = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(length > r)
			System.out.println("점 ("+x2+", "+y2+")은 원 밖에 있습니다.");
		else if(length < r)
			System.out.println("점 ("+x2+", "+y2+")은 원 안에 있습니다.");
	}
}








