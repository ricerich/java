package ex04.example.p3;

public class Goods 
{
	String name;
	private int price;
	private int numberOfStock;
	private int sold;

	Goods(String n, int p, int nStock, int s) 
	{
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public int getSold() {
		return sold;
	}
}
