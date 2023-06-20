package ex05.problem;

import java.util.Scanner;

public class ShapeManager 
{
	Shape start;
	Shape end;
	
	String name;
	
	public ShapeManager()
	{
		start = null;
		end = null;
	}
	
	public ShapeManager(String name)
	{
		super();
		this.name = name;
	}
	
	public void run()
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("그래픽 에디터 "+name+"을 실행합니다.");
		
		while(true)
		{
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>");
			int option = sc1.nextInt();
			
			switch(option)
			{
				case 1://입력
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					int type = sc1.nextInt();
					insert(type);
					
					break;
				case 2://삭제
					System.out.print("삭제할 도형의 위치>>");
					int pos = sc1.nextInt();
					delete(pos);
					break;
				case 3:
					view();
					break;
				case 4:
					System.out.println(name+"을 종료합니다.");
					return;
				default:
					System.out.println("(1~4)의 숫자를 입력해주셔야 합니다");
//					return;
			}
		}
	}
	
	private void insert(int type) {
		
		Shape obj = null;
		switch(type)
		{
			case 1:
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		if(start == null)//링크드 리스트가 비어 있을때
		{
			start = obj;
			end = obj;
		}
		else // 리스트가 몇개가 들어가 있을때
		{
//			end.next = obj;
			end.setNext(obj);//현재 마지막 뒤에, 붙임
			end = obj;//방금넣은 객체를 end로
		}
	}

	private void delete(int pos) {
		
		Shape previous = start;//앞의 객체
		Shape current = start;//현재 객체
		
		//1.삭제를 실패할 경우가 있다.
		//1)리스트가 비어 있을 때
		//2)해당위치(pos)에 객체 없을때
		
		if(start == null)
		{
			System.out.println("리스트가 비어있습니다.");//1)리스트가 비어 있을 때
			return;
		}
		
		for(int i=0; i<pos; i++)//2)해당위치(pos)에 객체 없을때 만 걸림, 아니면 계속 감
		{
			previous = current;
			current = current.getNext();
			
			if(current == null)
			{
				System.out.println(i+"까지 밖에 객체가 없습니다");
				return;
			}
		}
		
		//2.삭제가 가능한 경우 수
		//1)1개만 있을경우
		//2)n개 중에-첫번째
		//3)n개 중에-마지막
		//4)n개 중에-가운데
		
		if(start == end)//1)1개만 있을경우
		{
			start = null;
			end = null;
			System.out.println("하나뿐인 객체를 삭제하였습니다.");
			return;
		}
		
		if(current == start)//2)n개 중에-첫번째
		{
			start = current.getNext();
			System.out.println("첫번째 원소를 삭제하였습니다.");
			return;
		}
		else if(current == end)//3)n개 중에-마지막
		{
			end = previous;
			end.setNext(null);
			System.out.println("마지막 원소를 삭제하였습니다.");
			return;
		}
		else //4)n개 중에-가운데
		{
//			previous.next = current.next;
			previous.setNext(current.getNext());
			System.out.println("삭제하였습니다.");
		}
		
		view();
	}

	private void view() 
	{
		Shape obj = start;
		while(obj != null)
		{
			obj.draw();
			obj = obj.getNext();
		}
	}
}












