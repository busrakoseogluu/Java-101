import java.util.Scanner;

public class DortVeBesinKuvvetleri {

	public static void main(String[] args) {
		/*
		 * Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana
		 * yazd�ran program� yaz�yoruz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Say� Giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i *= 4) {
			System.out.println(i + " , ");
		}
		for (int i = 1; i <= sayi; i *= 5) {
			System.out.println( i + " , ");
		}
	}

}
