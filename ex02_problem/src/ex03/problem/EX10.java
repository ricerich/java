package ex03.problem;

public class EX10 
{
	public static void main(String[] args) 
	{
		int arr1[][]= new int[4][4];
		
		//0으로 전부 넣기
		for(int i=0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++) {
				arr1[i][j] = 0;
			}
		}
		
		for(int i=0; i<10;i++){
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(arr1[row][col] == 0)
				arr1[row][col] = (int)(Math.random()*10 +1);
			else
			{
				i--;
			}
			
		}
		
		
		//배열의 원소 출력
		for(int i=0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t") ;
			}
			System.out.println();
		}
	}
}



