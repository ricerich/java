package ex02.problem;
import java.util.Scanner;

public class EX12_1_if {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산(예: 3 + 7)>>");
		int x = sc1.nextInt();
		String op = sc1.next();
		int y = sc1.nextInt();
		
		int result = 0;
		
//		if(op == "+") //이거 안됨!! op가 String
		if(op.equals("+")) 
			result = x + y;
		else if(op.equals("-")) 
			result = x - y;
		else if(op.equals("*")) 
			result = x * y;
		else if(op.equals("/"))
		{
			if(y==0) {
				System.out.println("0으로 나눌수 없어요");
				sc1.close();
				return;
			}
			else	
				result = x / y;
		}
		else
		{
			System.out.println("사칙 연산이 아닙니다");
			sc1.close();
			return;
		}
			
		
		System.out.println(x+" "+op+" "+y+"의 계산 결과는 "+result);
		sc1.close();
		
	}
}













