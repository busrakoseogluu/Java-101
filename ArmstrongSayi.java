import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayý giriniz : ");
		int sayi = scan.nextInt();
		int sayi1 = sayi;
		int sayac = 0;
		int basDegeri;
		int total, result = 0;
		// kaç basamak olduðunu bulmak için
		while (sayi1 != 0) {
			sayi1 /= 10;
			sayac++;
		}
		sayi1 = sayi;
		// basamak deðerlerini bulma ve üssü hesaplama
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
			System.out.println(sayi + " bir armstrong sayýdýr.");
		} else {
			System.out.println(sayi + " bir armstrong sayý deðildir.");
		}

	}

}
