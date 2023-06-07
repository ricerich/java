package ex04.example.overloading;

public class Basic {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int z=33;
		int w=55;
		
		MathUtil mu1 = new MathUtil();
		int n = mu1.getSum(x,y);
		System.out.println("두 수의 합은 "+n);
		
		n = mu1.getSum(x, y, z);
		System.out.println("세 수의 합은 "+n);
		
		n = mu1.getSum(x, y, z, w);
		System.out.println("네 수의 합은 "+n);
		
		float a = 30.45f;
		
		float n2 = mu1.getSum(x, a);
		System.out.println("두 수의 합은 "+n2);

	}
}
