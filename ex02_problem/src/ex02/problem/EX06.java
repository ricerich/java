package ex02.problem;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("(1~99)사이의 정수를 입력해주세요>>");
		int num = sc1.nextInt();
		
		if(num < 1 || num > 99)
		{
			System.out.println("2자리의 수를 입력하셔야합니다");
			return;
		}
		
		int cnt=0; //3,6,9의 총갯수를 저장
		
		int ten = num / 10;
		int one = num % 10;
		
		if(ten==3 || ten==6 || ten==9)
			cnt++;
		
		if(one==3 || one==6 || one==9)
			cnt++;
		
		if(cnt == 0)
			System.out.println("박수 없음");
		else if(cnt == 1)
			System.out.println("박수 짝");
		else if(cnt == 2)
			System.out.println("박수 짝짝");
		
		
//		if(num >=1 && num <= 99)
//		{
//			//여기에 코딩
//		}
//		else
//		{
//			System.out.println("2자리의 수를 입력하셔야합니다");
//			return;
//		}
		
		
		
		sc1.close();
	}

}
