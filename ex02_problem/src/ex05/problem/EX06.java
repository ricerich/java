package ex05.problem;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) 
	{
		int money = 0;
		int cnt = 0;//화폐 갯수
		
		int []unit = {50000,10000,1000,500,100,50,10,1};

		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = sc1.nextInt();
		
		for(int i=0; i<unit.length;i++)
		{
			cnt = money / unit[i];
			money = money % unit[i];
			
			if(cnt == 0)
				continue;
			
			if(unit[i] > 500)
				System.out.println(unit[i]+"원짜리 "+cnt+" 매");
			else
				System.out.println(unit[i]+"원짜리 "+cnt+" 개");
		}
		
//		cnt = money / 50000;
//		money = money % 50000;
//		System.out.println("오만원권 "+cnt+" 매");
//		
//		cnt = money / 10000;
//		money = money % 10000;
//		System.out.println("만원권 "+cnt+" 매");
//		
//		cnt = money / 1000;
//		money = money % 1000;
//		System.out.println("천원권 "+cnt+" 매");
//
//		cnt = money / 500;
//		money = money % 500;
//		System.out.println("오백원 "+cnt+" 개");
//		
//		cnt = money / 100;
//		money = money % 100;
//		System.out.println("백원권 "+cnt+" 개");
//		
//		cnt = money / 50;
//		money = money % 50;
//		System.out.println("오십원권 "+cnt+" 개");
//		
//		cnt = money / 10;
//		money = money % 10;
//		System.out.println("십원권 "+cnt+" 개");
//		
//		cnt = money / 1;
//		money = money % 1;
//		System.out.println("일원권 "+cnt+" 개");
		
		sc1.close();
	}

}
