package ex05.problem;

import java.util.Scanner;

public class EX16 
{
	public static void main(String[] args) 
	{
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("가위 바위 보 게임을 시작합니다.");
        while(true)
        {
        	System.out.print("가위 바위 보!>>");
        	String me = sc1.next();
        	
        	if(me.equals("그만"))
        	{
        		System.out.println("게임을 종료합니다.");
        		break;
        	}
        	
        	int n = (int)(Math.random()*3); //컴퓨터가 낸것을 랜덤하게 선택
        	String com1[] = {"가위", "바위", "보"};
        	String com = com1[n];
        	
        	if(me.equals("가위"))
        	{
        		if(com.equals("가위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 비겼습니다.");
        		else if(com.equals("바위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 컴퓨터가 이겼습니다.");
        		else if(com.equals("보"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 사용자가 이겼습니다.");
        	}
        	else if(me.equals("바위"))
        	{
        		if(com.equals("가위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 사용자가 이겼습니다.");
        		else if(com.equals("바위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 비겼습니다");
        		else if(com.equals("보"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 컴퓨터가 이겼습니다.");
        	}
        	else if(me.equals("보"))
        	{
        		if(com.equals("가위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 컴퓨터가 이겼습니다.");
        		else if(com.equals("바위"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 사용자가 이겼습니다.");
        		else if(com.equals("보"))
        			System.out.println("사용자="+ me+", 컴퓨터="+com+", 비겼습니다.");
        	}
        	else
        		System.out.println("가위 바위 보 중에서 입력해주세요!");
        	
        }
		
		
		sc1.close();
	}
}


