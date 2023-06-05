package OOP;

public class EX01_BASIC 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		System.out.println(s1.name);
		
		s1.name = "이순신";
		
		System.out.println(s1.name);
		
		s1.name = "강개토";
		
		String str1 = s1.getName();
		System.out.println(str1);
	}

}
