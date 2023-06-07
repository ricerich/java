package ex04.example.CALLBY_ARRAY;

public class Basic {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		
		//1.객체로 만들어 쓰는 방식
		ArrayParameter ap1 = new ArrayParameter();
		
		ap1.printCharArray(c);
		ap1.replaceSpace(c);
		ap1.printCharArray(c);
		
		//2.객체 안만들고 사용하는 방식
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
		
	}

}
