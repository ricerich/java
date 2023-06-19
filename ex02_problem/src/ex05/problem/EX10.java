package ex05.problem;

public class EX10 
{
	public static void main(String[] args) 
	{
		Dictionary dic = new Dictionary(10);
		dic.put("손흥민", "축구");
		dic.put("아이유", "가수");
		dic.put("아이유", "배우");
		System.out.println("아이유의 값은 " + dic.get("아이유"));
		System.out.println("손흥민의 값은 " + dic.get("손흥민"));
		String ok = dic.delete("손흥민");
		if(ok == null)
			System.out.println("삭제 할 대상이 없어요");
		else
			System.out.println(ok+"를 삭제하였습니다");
		
		String value = dic.get("손흥민");
		if(value == null)
			System.out.println("가져올 대상이 없어요");
		else
			System.out.println("손흥민의 값은 " + dic.get("손흥민"));
	}
}



