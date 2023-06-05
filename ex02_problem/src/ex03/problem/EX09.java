package ex03.problem;

public class EX09 
{
	public static void main(String[] args) 
	{
		int arr1[][]= new int[4][4];
		
		for(int i=0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++) {
				arr1[i][j] = (int)(Math.random()*10 +1);
			}
		}
		
		for(int i=0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t") ;
			}
			System.out.println();
		}
	}
}



