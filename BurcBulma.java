import java.util.Scanner;

public class BurcBulma {
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
		int ay = scan.nextInt();

		System.out.print("Do�du�unuz g�n : ");
		int gun = scan.nextInt();

		if (ay == 1) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("O�lak Burcusunuz.");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("Kova Burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 2) {
			if (gun >= 1 && gun <= 19) {
				System.out.println("Kova Burcusunuz.");
			} else if (gun <= 28) {
				System.out.println("Bal�k Burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 3) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Bal�k burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Ko� burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 4) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Ko� burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Bo�a burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 5) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Bo�a burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("�kizler burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 6) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("�kizler burcusnuz.");
			} else if (gun <= 30) {
				System.out.println("Yenge� burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 7) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Yenge� burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Aslan burcusunuz");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 8) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Aslan burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Ba�ak burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 9) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Ba�ak burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Terazi burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 10) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Terazi burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Akrep burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 11) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Akrep burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Yay burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}
		if (ay == 12) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Yay Burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("O�lak burcusunuz.");
			} else {
				System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
			}
		}

	}

}
