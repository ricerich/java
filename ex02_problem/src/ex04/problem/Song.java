package ex04.problem;

public class Song 
{
	private String title;
	private String artist;
	private int    year;
	private String conuntry;
	
	public Song() {
//		this.title = "Dancing Queen";
//		this.artist = "ABBA";
//		this.year = 1978;
//		this.conuntry = "스웨덴";
	}

	public Song(String title, String artist, int year, String conuntry) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.conuntry = conuntry;
	}

	public void show() {
		System.out.println(year+"년 "+conuntry+" 국적의 "+artist+"가 부른 "+title);
	}
	
	
	

}
