import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("�ss� al�nacak say�y� giriniz : ");
		int n = scan.nextInt();
		System.out.print("�ss� giriniz : ");
		int r = scan.nextInt();
		int total = 1;
		for (int i = 1; i <= r; i++) {
			total *= n;
		}
		System.out.println("Cevap : " + total);
	}

}
