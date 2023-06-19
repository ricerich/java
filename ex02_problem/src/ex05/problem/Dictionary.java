package ex05.problem;

public class Dictionary extends PairMap 
{
	private int count;

	protected String keyArray []; // key들을 저장하는 배열
	protected String valueArray []; // value 들을 저장하는배열
	
	
	public Dictionary(int size) {
		cnt = 0;
		keyArray = new String[size];
		valueArray = new String[size];
		
	}

	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void put(String key, String value) {
		
		int i=0;//입력할 위치
		for(i=0; i<count; i++)
		{
			//입력을 하는데, 같은 키값이 있다면, 해당 인덱스를 저장
			if(keyArray[i].equals(key))
				break;
		}
		
		if(i == count)//같은 키값이 없을때, 신규 삽입
		{
			if(i<keyArray.length)
			{
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
	
		}
		else//같은 키값이 있을때, 덮어쓰기
		{
			keyArray[i] = key;
			valueArray[i] = value;
		}
		
		
	}

	@Override
	String delete(String key) 
	{
		int i=0;//삭제할 위치
		for(i=0; i<count; i++)
		{
			//입력을 하는데, 같은 키값이 있다면, 해당 인덱스를 저장
			if(keyArray[i].equals(key))
				break;
		}
		
		if(i == count)//같은 키값이 없을때, 삭제 못함
			return null;

		//같은 키값이 있을 때, 해당위치 i를 찾았고, 값을 반환 
		count--;
		return valueArray[i];
	}

	@Override
	int length() {
		return count;
	}

}






