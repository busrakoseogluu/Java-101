import java.util.Scanner;

public class CiftVeDordunKatlar� {

	public static void main(String[] args) {

		/*
		 * Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul
		 * eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		 * ekrana basan program� yaz�yoruz.
		 */
		Scanner scan = new Scanner(System.in);
		int sayi, toplam = 0;

		do {
			System.out.print("Say� Giriniz : ");
			sayi = scan.nextInt();
			if (sayi % 2 == 0 && sayi % 4 == 0) {
				toplam += sayi;
			}

		} while (sayi % 2 == 0);
		System.out.println("�ift ve 4'�n katlar� olan say�lar�n toplam� : " + toplam);
	}

}
