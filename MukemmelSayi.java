import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Say� giriniz : ");
		int n = scan.nextInt();
		int carpan = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				carpan += i;
			}
		}
		carpan -= n;
		if (carpan == n) {
			System.out.println(n + " bir m�kemmel say�d�r. ");
		} else {
			System.out.println(n + " bir m�kemmel say� de�ildir.");
		}

	}

}
