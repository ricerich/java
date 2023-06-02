package ex03.problem;

public class EX01 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0; i<100; i=i+2)
		{
			sum = sum + i;
		}
		
		System.out.println("1~99까지의 짝수의 합"+sum);
		
	}

}
