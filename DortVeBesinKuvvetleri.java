import java.util.Scanner;

public class DortVeBesinKuvvetleri {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana
		 * yazdýran programý yazýyoruz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayý Giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i *= 4) {
			System.out.println(i + " , ");
		}
		for (int i = 1; i <= sayi; i *= 5) {
			System.out.println( i + " , ");
		}
	}

}
