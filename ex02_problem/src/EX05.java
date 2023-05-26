import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개를 입력해주세요>>");
		
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		int z = sc1.nextInt();
		
//		if( x+y>z && x+z>y && y+z>x)
//			System.out.println("삼각형이 됩니다(O)");
//		else
//			System.out.println("삼각형이 안됩니다(X)");
		
		if( x+y<=z || x+z<=y || y+z<=x)
			System.out.println("삼각형이 안됩니다(X)");
		else
			System.out.println("삼각형이 됩니다(O)");
		
		sc1.close();
	}

}
