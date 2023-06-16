package ex05.problem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX15 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		do
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			
			try {
				int n = sc1.nextInt();
				int m = sc1.nextInt();
				System.out.println(n + " x " + m + " = " + n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력하여야 합니다");
				sc1.nextLine();
			}
		}while(true);
		
		sc1.close();
	}
}


