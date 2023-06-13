package ex04.problem;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) 
	{
		System.out.println("한영 단어 검색프로그램입니다");
		Scanner sc1 = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("한글 단어?>>");
			String kor = sc1.next();
			
			if(kor.equals("그만")){
				System.out.println("종료합니다.");
				break;
			}
			
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor+"은(는) 저의 사전에 없습니다");
			else
				System.out.println(kor+"은 "+eng);
			
			
		}
		
		sc1.close();
	}

}





