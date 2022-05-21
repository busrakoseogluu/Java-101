import java.util.Scanner;

public class BuyukKucuk {

	public static void main(String[] args) {

		/*
		 * Java ile klavyeden girilen N tane sayma sayýsýndan en büyük ve en küçük
		 * sayýlarý bulan ve bu sayýlarý ekrana yazan programý yazýn.
		 */
		Scanner scan = new Scanner(System.in);

		int sayi;
		System.out.print("Kaç sayý gireceksiniz : ");
		int n = scan.nextInt();

		int max = 0;
		int min = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Sayý : ");
			sayi = scan.nextInt();
			if (i == 1) {
				max = sayi;
				min = sayi;
			}
			if (sayi > max) {
				max = sayi;
			}
			if (sayi < min) {
				min = sayi;
			}
		}
		System.out.println("En büyük : " + max);
		System.out.println("En küçük : " + min);

	}

}
