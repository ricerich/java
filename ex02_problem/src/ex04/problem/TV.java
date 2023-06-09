package ex04.problem;

public class TV {

	private String manufacturer; 
	private int year;
	private int inch;
	
	public TV(String manufacturer, int year, int inch) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(manufacturer+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	
	
}
