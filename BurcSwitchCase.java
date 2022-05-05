import java.util.Scanner;

public class BurcSwitchCase {
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
		int month = scan.nextInt();
		System.out.print("Doğduğunuz gün : ");
		int day = scan.nextInt();
		
		switch(month) {
		case 1:
			if(day>=1 && day<=21)
				System.out.println("Oğlak");
			else if(day<=31)
				System.out.println("Kova");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 2:
			if(day>=1 && day<=19)
				System.out.println("Kova");
			else if(day<=28)
				System.out.println("Balık");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 3:
			if(day>=1 && day<=20)
				System.out.println("Balık");
			else if(day<=31)
				System.out.println("Koç");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 4:
			if(day>=1 && day<=20)
				System.out.println("Koç");
			else if(day<=30)
				System.out.println("Boğa");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 5:
			if(day>=1 && day<=21)
				System.out.println("Boğa");
			else if(day<=31)
				System.out.println("İkizler");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 6:
			if(day>=1 && day<=22)
				System.out.println("İkizler");
			else if(day<=30)
				System.out.println("Yengeç");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 7:
			if(day>=1 && day<=22)
				System.out.println("Yengeç");
			else if(day<=31)
				System.out.println("Aslan");			
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 8:
			if(day>=1 && day<=22)
				System.out.println("Aslan");
			else if(day<=30)
				System.out.println("Başak");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 9:
			if(day>=1 && day<=22)
				System.out.println("Başak");
			else if(day<=31)
				System.out.println("Terazi");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 10:
			if(day>=1 && day<=22)
				System.out.println("Terazi");
			else if(day<=31)
				System.out.println("Akrep");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 11:
			if(day>=1 && day<=21)
				System.out.println("Akrep");
			else if(day<=30)
				System.out.println("Yay");
			else
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz.");
			break;
		case 12:
			if(day>=1 && day<=21)
				System.out.println("Yay");
			else if(day<=31)
				System.out.println("Oğlak");
			break;
			default:
				System.out.println("Yanlış işlem yaptınız. Tekrar deneyiniz. ");
			
		}

	}

}
