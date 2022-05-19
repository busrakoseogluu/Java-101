import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Faktöriyel Sayýsý : ");
		int f = scan.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= f; i++) {
			faktoriyel *= i;
		}
		System.out.println(faktoriyel);
	}
}
