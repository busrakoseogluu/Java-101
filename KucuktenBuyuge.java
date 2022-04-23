import java.util.Scanner;

public class KucuktenBuyuge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Ýlk sayýyý giriniz : ");
		int a = scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz : ");
		int b = scan.nextInt();
		System.out.print("Üçüncü sayýyý giriniz : ");
		int c = scan.nextInt();

		System.out.println("a = " + a + " b = " + b + " c = " + c);

		if (a == b && a < c) {
			System.out.println("a=b<c");
			if (c < a)
				System.out.println("c<a=b");
		} else if (a == c && a < b) {
			System.out.println("a=c<b");
			if (b < a)
				System.out.println("b<a=c");
		} else if (b == c && a < b) {
			System.out.println("a<b=c");
			if (a > b)
				System.out.println("b=c<a");
		} else if (a == b && b == c) {
			System.out.println("a=b=c");

		} else if (a < b && a < c) {
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
			if (a < b) {
				System.out.println("c<a<b");
			} else {
				System.out.println("c<b<a");
			}

		}
	}
}
