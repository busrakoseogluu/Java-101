import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {

		/*
		 * Java ile kullanýcýlarýn manavdan almýþ olduklarý ürünlerin kilogram
		 * deðerlerine göre toplam tutarýný ekrana yazdýran programý yazýn.
		 * 
		 * Meyveler ve KG Fiyatlarý
		 * 
		 * Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlýcan : 5,00
		 * TL
		 */

		Scanner scan = new Scanner(System.in);

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,toplam;
		int armutK,elmaK,domatesK,muzK,patlicanK;
		
		System.out.print("Armut kaç kilo ? ");
		armutK = scan.nextInt();
		System.out.print("Elma kaç kilo ? ");
		elmaK=scan.nextInt();
		System.out.print("Domates kaç kilo ? ");
		domatesK=scan.nextInt();
		System.out.print("Muz kaç kilo ? ");
		muzK=scan.nextInt();
		System.out.print("Patlýcan kaç kilo ? ");
		patlicanK=scan.nextInt();
		
		toplam = ((armut*armutK)+(elma*elmaK)+(domates*domatesK)+(muz*muzK)+(patlican*patlicanK));
		System.out.println("Toplam tutar : " + toplam);
		
		

	}

}
