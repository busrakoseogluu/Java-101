import java.util.Scanner;

public class TekSayi {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile negatif bir deðer girilene kadar kullanýcýdan giriþleri
		 * kabul eden ve girilen deðerlerden tek sayýlarý toplayýp ekrana basan programý
		 * yazýyoruz.
		 */

		Scanner scan = new Scanner(System.in);
		
		int sayi,toplam=0;
		
		do {
			System.out.print("Sayý giriniz : ");
			sayi=scan.nextInt();
			if(sayi%2==1) {
				toplam+=sayi;
			}
			
		}while(sayi>0);
		
		System.out.println("Tek sayýlarýn toplamý : " + toplam);

	}

}
