package ex03.problem;
import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		String s = sc1.next();//일단 String 으로 입력받고,
		char ch = s.charAt(0);
		
		if(ch<'a' || ch >'z')
		{
			System.out.println("소문자(a~z)사이를 입력하셔야 합니다.");
			sc1.close();
			return;
		}

			
		for(char i=ch; i>='a'; i--)
		{
			for(char j='a'; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		sc1.close();

	}

}















