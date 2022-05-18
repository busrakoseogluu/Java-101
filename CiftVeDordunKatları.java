import java.util.Scanner;

public class CiftVeDordunKatlarý {

	public static void main(String[] args) {

		/*
		 * Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul
		 * eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		 * ekrana basan programý yazýyoruz.
		 */
		Scanner scan = new Scanner(System.in);
		int sayi, toplam = 0;

		do {
			System.out.print("Sayý Giriniz : ");
			sayi = scan.nextInt();
			if (sayi % 2 == 0 && sayi % 4 == 0) {
				toplam += sayi;
			}

		} while (sayi % 2 == 0);
		System.out.println("Çift ve 4'ün katlarý olan sayýlarýn toplamý : " + toplam);
	}

}
