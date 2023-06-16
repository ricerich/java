package ex05.problem;

public class IPTV extends ColorTV 
{
	private String ip;

	public IPTV(String ip, int size, int pixel) 
	{
		super(size, pixel);
		this.ip = ip;
	}

	@Override
	public void printProperty() 
	{
		System.out.print("나의 IPTV는 "+ip+" 주소의 ");
		super.printProperty();
	}

}
