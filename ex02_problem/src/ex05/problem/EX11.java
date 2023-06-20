package ex05.problem;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}

class Add extends Calc{
	
	public int calculate()
	{
		return a+b;
	}
}

class Sub extends Calc{
	
	public int calculate()
	{
		return a-b;
	}
}

class Mul extends Calc
{
	public int calculate()
	{
		return a*b;
	}
}

class Div extends Calc{
	public int calculate()
	{
		return a/b;
	}
}
public class EX11 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char ch1 = sc1.next().charAt(0);
		
		Calc calc1 = null;
		switch(ch1)
		{
			case '+' :
				calc1 = new Add();
				break;
			case '-' :
				calc1 = new Sub();
				break;
			case '*' :
				calc1 = new Mul();
				break;
			case '/' :
				calc1 = new Div();
				break;
				
			default :
				System.out.println("잘못 입력하셨습니다.");
		}
		
		calc1.setValue(a, b);
		
		if(calc1 instanceof Div && b==0)
			System.out.println("0으로 나눌수 없어요");
		else
			System.out.println(calc1.calculate());
		
		sc1.close();
	}
}



