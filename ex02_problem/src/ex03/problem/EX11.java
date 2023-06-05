package ex03.problem;

public class EX11 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("명령행 인자(arguments)가 없어요");
			return;
		}
		
		int sum=0;
		for(int i=0;i<args.length;++i) {
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.println(sum/args.length);
	}
}



