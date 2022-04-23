import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Ýlk sayýyý giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz : ");
		int sayi2 = scan.nextInt();

		System.out.print("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\nYapmak istediðiniz iþlemi seçiniz : ");
		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Sonuç : " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Sonuç : " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Sonuç : " + (sayi1 * sayi2));
			break;
		case 4:
			if (sayi2 == 0) {
				System.out.println("Bir sayý 0'a bölünemez ! \nTekrar deneyin. ");
			} else {
				System.out.println("Sonuç : " + (sayi1 / sayi2));
			}
			break;
		default:
			System.out.println("Yanlýþ iþlem yaptýnýz. Tekrar deneyiniz.");
		}

	}

}
