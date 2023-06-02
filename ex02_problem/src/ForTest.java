
public class ForTest {

	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=0; i<10; i++) 
		{
			sum += i+1;
			System.out.print(i+1);
			if (i == 9) {
				System.out.print("=");
				System.out.print(sum);
			} else
				System.out.print("+");
		}

		System.out.println();
		

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
		
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			
			if (i%2 == 1)
				continue;
			
			sum += i;
			
			
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum);


	}
}
