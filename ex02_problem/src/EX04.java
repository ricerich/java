import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		int z = sc1.nextInt();
		
		int mid = 0;
		
		if( (x>=y && x<=z) ||( x>=z && x<=y) )//x가 중간값(mid)일 경우 
		{
			mid = x;
		}
		else if((y>=x && y<=z) ||( y>=z && y<=x))//y가 중간값(mid)일 경우 
		{
			mid = y;
		}
		else if((z>=x && z<=y) ||( z>=y && z<=x))//z가 중간값(mid)일 경우 
		{
			mid = z;
		}
		else
			System.out.println("오류입니다!!");
		
		
		System.out.println("중간값은 " + mid);
		
		sc1.close();

	}

}















