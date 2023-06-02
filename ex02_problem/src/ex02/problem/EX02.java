package ex02.problem;
import java.util.Scanner;

public class EX02 
{
	public static void main(String[] args) 
	{
		int num = 0; //입력받은 정수 저장
		
		int ten=0;//십의 자리수 저장
		int one=0;//일의 자리수 저장
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("2자리 정수를 입력하세요(10~99)>>");
		num = sc1.nextInt();
		
		//2자리가 아닌 1자리나, 3자리를 거른다(필터링한다)
		if(num<10 || num>99)
		{
			System.out.println("10~99 사이의 정수만 입력할수 있어요");
			sc1.close();
			return;//함수종료, main() 함수 종료, 즉 프로그램 종료
		}

		//num 예: 24
		ten = num / 10;
		one = num % 10;
		
		if(ten == one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다!");
		else 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다!");
	
		sc1.close();
	}

}










