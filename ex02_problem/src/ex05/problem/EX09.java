package ex05.problem;

import java.util.Scanner;

public class EX09 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int size = sc1.nextInt();
		
		//Stack s[] = new Stack[size];
//		StringStack s1 = new StringStack(size);
		Stack stack1 = new StringStack(size);
		
		while(true)
		{
			System.out.print("문자열 입력>>");
			String val = sc1.next();
			
			if(val.equals("그만"))
				break;
			
//			boolean ok = stack1.push(val);
//			if(ok == false)
//			if(ok != true)
			if(!stack1.push(val))
				System.out.println("스택이 꽉 차서 푸시 불가!");
			
		}
		
		System.out.print("스택에 저장된 모든 문자열 1개씩 꺼내기(팝)");
		int length = stack1.length();
		for(int i=0; i<length;i++)
		{
			String val = stack1.pop();
			System.out.print(" " + val);
		}
	}
}












