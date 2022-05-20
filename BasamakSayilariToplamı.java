import java.util.Scanner;

public class BasamakSayilariToplamý {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayý Giriniz : ");
		int sayi = scan.nextInt();
		int result = 0, basDeg, sayac = 0;

		while (sayi != 0) {
			result += sayi % 10;
			sayi /= 10;
			sayac++;
		}
		System.out.println("Basamaklarýn Toplamý : " + result);
	}

}
