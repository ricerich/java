package ex03.problem;

import java.util.Scanner;

public class EX14 
{
	public static void main(String[] args) 
	{
		String course [ ] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [ ] = {95, 88, 76, 62, 55};
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목 이름>>");
			String name = sc1.nextLine();
			
			if(name.equals("그만"))
				break;
			
			for(int i=0; i<course.length;++i)
			{
				
//				if(name.equals(course[i]))
				if(course[i].equals(name))
				{
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				else
				{
					if(i==course.length-1)
						System.out.println("없는 과목입니다.");	
				}
			}
		}
		sc1.close();
	}
}


