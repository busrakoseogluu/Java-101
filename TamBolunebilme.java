import java.util.Scanner;

public class TamBolunebilme {

	public static void main(String[] args) {
		
		/*Java'da girilen sayýya kadar olan sayýlardan 3'e ve 4'e tam bölünebilen sayýlarýn ortalamasýný hesaplayan program*/

		Scanner scan = new Scanner(System.in);
		int toplam = 0, sayac = 0;
		System.out.print("Sayý Giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				sayac++;
				System.out.println("3'e ve 4'e tam bölünebilen sayýlar : " + i);
			}
		}
		System.out.println("Sayýlarýn ortalamasý  : " + (toplam / sayac));
	}

}
