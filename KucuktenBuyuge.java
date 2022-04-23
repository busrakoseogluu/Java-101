import java.util.Scanner;

public class KucuktenBuyuge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("İlk sayıyı giriniz : ");
		int a = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int b = scan.nextInt();
		System.out.print("Üçüncü sayıyı giriniz : ");
		int c = scan.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.println("a<b<c");
			} else {
				System.out.println("a<c<b");
			}
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println("b<a<c");
			} else {
				System.out.println("b<c<a");
			}
		} else {
			if (b < a) {
				System.out.println("c<b<a");
			} else {
				System.out.println("c<a<b");
			}
		}

	}

}
