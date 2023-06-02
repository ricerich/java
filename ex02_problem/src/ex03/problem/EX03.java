package ex03.problem;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) 
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n= sc1.nextInt();
		
		if(n<0)
		{
			System.out.println("0이상의 정수를 입력하셔야 합니다.");
			sc1.close();
			return;
		}
			
		for(int i=n; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc1.close();
	}
}
