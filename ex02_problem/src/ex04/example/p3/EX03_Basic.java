package ex04.example.p3;

import java.util.Scanner;

public class EX03_Basic {
	public static void main(String[] args) 
	{
		Goods[] goods1 = new Goods[3];

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < goods1.length; i++) 
		{
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			
			goods1[i] = new Goods(name, price, n, sold);
		}

		for (int i = 0; i < goods1.length; i++) {
			System.out.print(goods1[i].name + " ");
			System.out.print(goods1[i].getPrice() + " ");
			System.out.print(goods1[i].getNumberOfStock() + " ");
			System.out.println(goods1[i].getSold());
		}
	}

}
