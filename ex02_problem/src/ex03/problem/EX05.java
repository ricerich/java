package ex03.problem;
import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) 
	{
		int arr1[] = new int[10];
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력해주세요>>");
		
		for(int i=0; i<arr1.length;i++)//넣을 때
		{
			arr1[i]= sc1.nextInt();
		}
		
		for(int i=0; i<arr1.length;i++)//빼낼 때 
		{
			int n = arr1[i];
			if(n%3 == 0)
				System.out.print(n +" ");
			
//			if(arr1[i]%3 == 0)
//				System.out.print(arr1[i] +" ");
		}
		
		sc1.close();
	}

}
