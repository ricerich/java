package ex03.problem;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("점 (x,y)를 입력해주세요>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		
		if((x>=100 && x<=200) && 
		   (y>=100 && y<=200) )
		{
			System.out.println("("+x+","+y+")은 사각형 안에 있습니다.");
		}
		else
			System.out.println("("+x+","+y+")은 사각형 안에 없습니다.");
		
		sc1.close();
	}

}
