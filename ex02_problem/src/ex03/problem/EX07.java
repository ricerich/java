package ex03.problem;

public class EX07 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[10];
		
		for(int i=0; i<arr1.length; i++)
		{
			//배열에 넣기: 랜덤수 10개 만들어서
			arr1[i] = (int)(Math.random()*10 +1);
		}
		
		int sum = 0;
		for(int i=0; i<arr1.length; i++)
		{
			//배열에서 꺼내기: 합계를 구하기위해서, 합계는 평균을 구할려고
			sum = sum + arr1[i];
		}
		
		System.out.print("랜덤한 정수들: ");
		for(int i=0; i<arr1.length; i++)
		{
			//배열에서 꺼내기: 원소 하나 하나씩 출력
			System.out.print(arr1[i]+" ");
			
			if(i == arr1.length-1)
				System.out.println();
		}
		
		System.out.println("평균은 " + sum/arr1.length);
	}

}
