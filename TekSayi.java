import java.util.Scanner;

public class TekSayi {

	public static void main(String[] args) {
		/*
		 * Java d�ng�ler ile negatif bir de�er girilene kadar kullan�c�dan giri�leri
		 * kabul eden ve girilen de�erlerden tek say�lar� toplay�p ekrana basan program�
		 * yaz�yoruz.
		 */

		Scanner scan = new Scanner(System.in);
		
		int sayi,toplam=0;
		
		do {
			System.out.print("Say� giriniz : ");
			sayi=scan.nextInt();
			if(sayi%2==1) {
				toplam+=sayi;
			}
			
		}while(sayi>0);
		
		System.out.println("Tek say�lar�n toplam� : " + toplam);

	}

}
