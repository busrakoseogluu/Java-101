import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {

		/*
		 * Java ile kullan�c�lar�n manavdan alm�� olduklar� �r�nlerin kilogram
		 * de�erlerine g�re toplam tutar�n� ekrana yazd�ran program� yaz�n.
		 * 
		 * Meyveler ve KG Fiyatlar�
		 * 
		 * Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patl�can : 5,00
		 * TL
		 */

		Scanner scan = new Scanner(System.in);

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,toplam;
		int armutK,elmaK,domatesK,muzK,patlicanK;
		
		System.out.print("Armut ka� kilo ? ");
		armutK = scan.nextInt();
		System.out.print("Elma ka� kilo ? ");
		elmaK=scan.nextInt();
		System.out.print("Domates ka� kilo ? ");
		domatesK=scan.nextInt();
		System.out.print("Muz ka� kilo ? ");
		muzK=scan.nextInt();
		System.out.print("Patl�can ka� kilo ? ");
		patlicanK=scan.nextInt();
		
		toplam = ((armut*armutK)+(elma*elmaK)+(domates*domatesK)+(muz*muzK)+(patlican*patlicanK));
		System.out.println("Toplam tutar : " + toplam);
		
		

	}

}
