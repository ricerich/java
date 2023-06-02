package ex02.problem;
import java.util.Scanner;

public class EX11_2_switch_case {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("달(월)을 입력해주세요(1~12)>>");
		int month = sc1.nextInt();
		
		if(month<1 || month>12) {
			System.out.println("(1~12)사이의 수를 입력하셔야 합니다");
			return;
		}
		
		switch(month)
		{
			case 3:
			case 4: 
			case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9, 10, 11:
				System.out.println("가을");
				break;
			case 12, 1, 2:
				System.out.println("겨울");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
		}
	}
}








