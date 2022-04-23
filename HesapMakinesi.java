import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("�lk say�y� giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.print("�kinci say�y� giriniz : ");
		int sayi2 = scan.nextInt();

		System.out.print("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\nYapmak istedi�iniz i�lemi se�iniz : ");
		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Sonu� : " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Sonu� : " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Sonu� : " + (sayi1 * sayi2));
			break;
		case 4:
			if (sayi2 == 0) {
				System.out.println("Bir say� 0'a b�l�nemez ! \nTekrar deneyin. ");
			} else {
				System.out.println("Sonu� : " + (sayi1 / sayi2));
			}
			break;
		default:
			System.out.println("Yanl�� i�lem yapt�n�z. Tekrar deneyiniz.");
		}

	}

}
