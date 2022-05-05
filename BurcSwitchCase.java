import java.util.Scanner;

public class BurcSwitchCase {
	/*
	 * Ko� Burcu : 21 Mart - 20 Nisan
	 * 
	 * Bo�a Burcu : 21 Nisan - 21 May�s
	 * 
	 * �kizler Burcu : 22 May�s - 22 Haziran
	 * 
	 * Yenge� Burcu : 23 Haziran - 22 Temmuz
	 * 
	 * Aslan Burcu : 23 Temmuz - 22 A�ustos
	 * 
	 * Ba�ak Burcu : 23 A�ustos - 22 Eyl�l
	 * 
	 * Terazi Burcu : 23 Eyl�l - 22 Ekim
	 * 
	 * Akrep Burcu : 23 Ekim - 21 Kas�m
	 * 
	 * Yay Burcu : 22 Kas�m - 21 Aral�k
	 * 
	 * O�lak Burcu : 22 Aral�k - 21 Ocak
	 * 
	 * Kova Burcu : 22 Ocak - 19 �ubat
	 * 
	 * Bal�k Burcu : 20 �ubat - 20 Mart
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Do�du�unuz ay : ");
		int month = scan.nextInt();
		System.out.print("Do�du�unuz g�n : ");
		int day = scan.nextInt();
		
		switch(month) {
		case 1:
			if(day>=1 && day<=21)
				System.out.println("O�lak");
			else if(day<=31)
				System.out.println("Kova");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 2:
			if(day>=1 && day<=19)
				System.out.println("Kova");
			else if(day<=28)
				System.out.println("Bal�k");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 3:
			if(day>=1 && day<=20)
				System.out.println("Bal�k");
			else if(day<=31)
				System.out.println("Ko�");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 4:
			if(day>=1 && day<=20)
				System.out.println("Ko�");
			else if(day<=30)
				System.out.println("Bo�a");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 5:
			if(day>=1 && day<=21)
				System.out.println("Bo�a");
			else if(day<=31)
				System.out.println("�kizler");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 6:
			if(day>=1 && day<=22)
				System.out.println("�kizler");
			else if(day<=30)
				System.out.println("Yenge�");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 7:
			if(day>=1 && day<=22)
				System.out.println("Yenge�");
			else if(day<=31)
				System.out.println("Aslan");			
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 8:
			if(day>=1 && day<=22)
				System.out.println("Aslan");
			else if(day<=30)
				System.out.println("Ba�ak");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 9:
			if(day>=1 && day<=22)
				System.out.println("Ba�ak");
			else if(day<=31)
				System.out.println("Terazi");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 10:
			if(day>=1 && day<=22)
				System.out.println("Terazi");
			else if(day<=31)
				System.out.println("Akrep");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 11:
			if(day>=1 && day<=21)
				System.out.println("Akrep");
			else if(day<=30)
				System.out.println("Yay");
			else
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			break;
		case 12:
			if(day>=1 && day<=21)
				System.out.println("Yay");
			else if(day<=31)
				System.out.println("O�lak");
			break;
			default:
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz. ");
			
		}

	}

}
