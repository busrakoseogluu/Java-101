import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Say� giriniz : ");
		int sayi = scan.nextInt();
		int sayi1 = sayi;
		int sayac = 0;
		int basDegeri;
		int total, result = 0;
		// ka� basamak oldu�unu bulmak i�in
		while (sayi1 != 0) {
			sayi1 /= 10;
			sayac++;
		}
		sayi1 = sayi;
		// basamak de�erlerini bulma ve �ss� hesaplama
		while (sayi1 != 0) {
			basDegeri = sayi1 % 10;
			total = 1;
			for (int i = 1; i <= sayac; i++) {
				total *= basDegeri;
			}
			sayi1 /= 10;
			result += total;
		}
		if (sayi == result) {
			System.out.println(sayi + " bir armstrong say�d�r.");
		} else {
			System.out.println(sayi + " bir armstrong say� de�ildir.");
		}

	}

}
