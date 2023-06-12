package ex04.problem;

import java.util.Scanner;

public class MonthSchedule 
{
	Scanner sc1;
	
	Day days[];
	
	public MonthSchedule(int total_day) 
	{
		sc1 = new Scanner(System.in);
		days = new Day[total_day];
		
		for(int i=0; i<total_day;i++)
			days[i] = new Day();
	}

	public void run() 
	{
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int type = sc1.nextInt();
			
			switch(type)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("1~3을 입력해주세요");
					return;
			}
		}
	}
	
	private void input()
	{
		System.out.print("날짜(1~30)?");
		int day = sc1.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc1.next();
		
//		days[day-1] = new Day();
		
		days[day-1].set(work);
		
		
	}
	
	private void view()
	{
		System.out.print("날짜(1~30)?");
		int day = sc1.nextInt();
		
		System.out.print(day+"일에 할일은 ");
		days[day-1].show();
//		System.out.println(" 입니다.");
	}
	
	private void finish()
	{
		System.out.println("프로그램을 종료합니다");
		sc1.close();
		return;
	}
}
