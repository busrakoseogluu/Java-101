import java.util.Scanner;

public class BuyukKucuk {

	public static void main(String[] args) {

		/*
		 * Java ile klavyeden girilen N tane sayma say�s�ndan en b�y�k ve en k���k
		 * say�lar� bulan ve bu say�lar� ekrana yazan program� yaz�n.
		 */
		Scanner scan = new Scanner(System.in);

		int sayi;
		System.out.print("Ka� say� gireceksiniz : ");
		int n = scan.nextInt();

		int max = 0;
		int min = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Say� : ");
			sayi = scan.nextInt();
			if (i == 1) {
				max = sayi;
				min = sayi;
			}
			if (sayi > max) {
				max = sayi;
			}
			if (sayi < min) {
				min = sayi;
			}
		}
		System.out.println("En b�y�k : " + max);
		System.out.println("En k���k : " + min);

	}

}
