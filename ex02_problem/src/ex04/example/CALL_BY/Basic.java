package ex04.example.CALL_BY;

class D{
	
}

class Basic {

	public static void main(String[] args) 
	{
		//1.call by value
		int b = 4;
		
		A a1 = new A();
		a1.add(b);
		
		System.out.println("Basic안의 b값은=" + b);
		
		//2.call by reference - 1)배열
		int a[] = new int[5];
		a[0] = 10;
		
		A a2 = new A();
		a2.addArr(a);
		
		System.out.println("Basic안의 a[0]값은=" + a[0]);
		
		//2.call by reference - 2)객체
		C c1 = new C();
		c1.n = 20;
		
		A a3 = new A();
		a3.addObj(c1);
		
		System.out.println("Basic안의 c1.n값은=" + c1.n);
		
	}

}




