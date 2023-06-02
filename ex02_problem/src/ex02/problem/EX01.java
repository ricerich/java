package ex02.problem;


import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		int won = 0;
		float dollar = 0.0f;
		final float RATE = 1216.0f;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원화를 입력하세요>>");
		won = sc1.nextInt();
		
//		dollar = (float)(won/1216.0);
		dollar = won/RATE;
		
		dollar = (int)(dollar*100)/100.0f;
		
		System.out.println(won+"원은 $"+dollar+" 달러입니다.");
		
		sc1.close();
	}

}
