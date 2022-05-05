import java.util.Scanner;

public class BurcBulma {
	/*
	 * Koç Burcu : 21 Mart - 20 Nisan
	 * 
	 * Boğa Burcu : 21 Nisan - 21 Mayıs
	 * 
	 * İkizler Burcu : 22 Mayıs - 22 Haziran
	 * 
	 * Yengeç Burcu : 23 Haziran - 22 Temmuz
	 * 
	 * Aslan Burcu : 23 Temmuz - 22 Ağustos
	 * 
	 * Başak Burcu : 23 Ağustos - 22 Eylül
	 * 
	 * Terazi Burcu : 23 Eylül - 22 Ekim
	 * 
	 * Akrep Burcu : 23 Ekim - 21 Kasım
	 * 
	 * Yay Burcu : 22 Kasım - 21 Aralık
	 * 
	 * Oğlak Burcu : 22 Aralık - 21 Ocak
	 * 
	 * Kova Burcu : 22 Ocak - 19 Şubat
	 * 
	 * Balık Burcu : 20 Şubat - 20 Mart
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Doğduğunuz ay : ");
		int ay = scan.nextInt();

		System.out.print("Doğduğunuz gün : ");
		int gun = scan.nextInt();

		if (ay == 1) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Oğlak Burcusunuz.");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("Kova Burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 2) {
			if (gun >= 1 && gun <= 19) {
				System.out.println("Kova Burcusunuz.");
			} else if (gun <= 28) {
				System.out.println("Balık Burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 3) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Balık burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Koç burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 4) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Koç burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Boğa burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 5) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Boğa burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("İkizler burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 6) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("İkizler burcusnuz.");
			} else if (gun <= 30) {
				System.out.println("Yengeç burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 7) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Yengeç burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Aslan burcusunuz");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 8) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Aslan burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Başak burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 9) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Başak burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Terazi burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 10) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Terazi burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Akrep burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 11) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Akrep burcusunuz.");
			} else if (gun <= 30) {
				System.out.println("Yay burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}
		if (ay == 12) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Yay Burcusunuz.");
			} else if (gun <= 31) {
				System.out.println("Oğlak burcusunuz.");
			} else {
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			}
		}

	}

}
