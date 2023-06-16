package ex05.problem;

public class ColorTV extends TV {

	private int pixel;
	
	public ColorTV(int size, int pixel) 
	{
		super(size);
		this.pixel = pixel;
	}

	public void printProperty() {
		System.out.println(""+getSize()+"인치 "+pixel+"컬러");
		
	}

}
