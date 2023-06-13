package ex04.problem;

public class ArrayUtil {

	public static int[] concat(int[] a1, int[] a2) 
	{
		int a3[] = new int[a1.length+a2.length];
		
		for(int i=0; i<a1.length; i++)
			a3[i] = a1[i];
		
		for(int i=0; i<a2.length; i++)
			a3[i+a1.length] = a2[i];
		
		return a3;
	}

	public static void print(int[] a3) 
	{
		System.out.print("[");
		for(int i=0; i<a3.length; i++) {
			System.out.print(a3[i]+" ");
		}
		System.out.print("]");
		
	}

}
