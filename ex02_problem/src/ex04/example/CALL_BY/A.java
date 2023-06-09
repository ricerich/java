package ex04.example.CALL_BY;

public class A {
	
	void add(int b)
	{
		b++;
		System.out.println("A안의 b값은=" + b);
	}
	
	void addArr(int a[])
	{
		int a1[] = new int[5];
		
		a1 = a;
		
		a[0]++;
		System.out.println("A안의 a[0]값은=" + a1[0]);
	}
	
	void addObj(C c1)
	{
		C c2 = new C();
		c2 = c1;
		
		c1.n++ ;
		System.out.println("A안의 c1.n값은=" + c1.n);
	}
	
}



