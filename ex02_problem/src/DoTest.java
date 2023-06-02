import java.util.Scanner;

public class DoTest 
{
	public static void main(String[] args) 
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("(a~z) 알파벳을 입력해주세요>>");
		String str1 = sc1.next();
		char ch1 = str1.charAt(0);
		
//		char a = 'a';
		char a = ch1;

		do {
			System.out.print(a);
			a = (char) (a + 1);
		} while (a <= 'f');
		
//		while (a <= 'f')
//		{
//			System.out.print(a);
//			a = (char) (a + 1);
//		}
	}
}
