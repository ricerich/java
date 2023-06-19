package ex04.problem;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a+b;
	}
	
}

class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a-b;
	}
}

class Mul extends Object{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a*b;
	}
}

class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		if(b==0)
			return 0;
			
		return a/b;
	}
}

public class EX12 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char ch1 = sc1.next().charAt(0);
		
		switch(ch1)
		{
			case '+' :
				Add a1 = new Add();
				a1.setValue(a, b);
				System.out.println(a1.calculate());
				break;
			case '-' :
				Sub a2 = new Sub();
				a2.setValue(a, b);
				System.out.println(a2.calculate());
				break;
			case '*' :
				Mul a3 = new Mul();
				a3.setValue(a, b);
				System.out.println(a3.calculate());
				break;
			case '/' :
				Div a4 = new Div();
				a4.setValue(a, b);
				System.out.println(a4.calculate());
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다.");
		}
		
		sc1.close();
	}
}


















