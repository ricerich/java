package ex04.example.overloading;

public class MathUtil 
{
	float getSum(int a, float b)
	{
		return a+b;
	}
	
	float getSum(float a, float b)
	{
		return a+b;
	}
	
	int getSum(int a, int b)
	{
		return a+b;
	}
	
	int getSum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	int getSum(int a, int b, int c, int d)
	{
		int n = a+b+c+d;
		System.out.println("4자리합입니다");
		return n;
	}

}
