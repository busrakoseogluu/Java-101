import java.util.Scanner;

public class TamBolunebilme {

	public static void main(String[] args) {
		
		/*Java'da girilen say�ya kadar olan say�lardan 3'e ve 4'e tam b�l�nebilen say�lar�n ortalamas�n� hesaplayan program*/

		Scanner scan = new Scanner(System.in);
		int toplam = 0, sayac = 0;
		System.out.print("Say� Giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				sayac++;
				System.out.println("3'e ve 4'e tam b�l�nebilen say�lar : " + i);
			}
		}
		System.out.println("Say�lar�n ortalamas�  : " + (toplam / sayac));
	}

}
