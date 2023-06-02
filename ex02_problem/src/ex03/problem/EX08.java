package ex03.problem;
import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 몇 개?(0~100)>>");
		int cnt = sc1.nextInt();
		
		if(cnt<0 || cnt>99) {
			System.out.println("0~100사이의 수를 입력해주세요");
			sc1.close();
			return;
		}
		
		int arr1[] = new int[cnt];
		
		for(int i=0; i<arr1.length; i++)
		{
			int n = (int)(Math.random()*10 +1);
			
			for(int j=0; j<i; ++j)
			{
				if(n==arr1[j])//같은게 있으니까 넣으면 안된다
				{
					i--;
				}
				else//같으게 없으니까 넣어도 된다
				{
					arr1[i] = n;		
				}
					
			}
			
			
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			if(i==0) {
				System.out.print(arr1[i]+" ");
			}
			else
			{
				if(i%10==0)
					System.out.println();
				
				System.out.print(arr1[i]+" ");
			}
		}
		
		
		
		
		sc1.close();
	}
}



