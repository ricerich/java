package ex03.problem;

public class EX13 
{
	public static void main(String[] args) 
	{
		String str1[] = {"박수 짝", "박수 짝짝"};
		
//		for(int i=1; i<=99; ++i)
//		{
//			int cnt=0; //3,6,9의 총갯수를 저장
//			
//			int ten = i / 10;
//			int one = i % 10;
//			
//			if(ten==3 || ten==6 || ten==9)
//				cnt++;
//			
//			if(one==3 || one==6 || one==9)
//				cnt++;
//			
////			if(cnt == 1)
////				System.out.println(i + " 박수 짝");
////			else if(cnt == 2)
////				System.out.println(i + " 박수 짝짝");
//			
//			if(cnt>=1)
//				System.out.println(i + str1[cnt-1]);
//		}
		
		
		for(int i=1; i<=99; ++i)
		{
			int num = i;
			int cnt=0;
			
			for(int j= num%10; num>0; j=num%10)
			{
				if(j==3 || j==6 || j==9 ) {
					cnt++;
				}
				num = num / 10;				
			}
			
			if(cnt>=1)
				System.out.println(i + str1[cnt-1]);
				
		}
		
		
		
		
	}
}











