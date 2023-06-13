package ex04.problem;

import java.util.Scanner;

public class PhoneBook {

	private Scanner sc1;
	Phone pArr[];

	public PhoneBook() {
		sc1 = new Scanner(System.in);
	}

	private void input() {
		// 1.입력,저장 -> input()
		System.out.print("인원수>>");
		int n = sc1.nextInt();

		// 객체를 저장할 객체배열을 먼저 만든다
		pArr = new Phone[n];

		for (int i = 0; i < pArr.length; i++) 
		{
			System.out.print("이름과 전화번호>>");
			String name = sc1.next();
			String tel = sc1.next();

			pArr[i] = new Phone(name, tel);
		}

		System.out.println("저장 되었습니다...");
	}
	
	private String search(String name)
	{
		// 검색 기능 구현(이름을 이용해서)
		for (int i=0; i < pArr.length; i++) 
		{
			if (name.equals(pArr[i].getName())) 
			{
				return pArr[i].getTel();
			}
		}
		
		return null;
	}
	
	private void view() {
		// 2.조회, 검색 -> view()
		while (true) {
			System.out.print("검색할 이름>>");
			String name = sc1.next();

			// 무한 loop는 종료조건 부터 설정
			if (name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}

			// 검색 기능 구현(이름을 이용해서)
			String tel = search(name);
			if (tel == null)
				System.out.println(name + "이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + "입니다");
		}
	}

	public void run() {
//		1.input();
//		2.view();//반복되고
//		3.finish();
		 
		input();// 1.입력,저장
		
		view();// 2.조회, 검색

		sc1.close();
	}
}
