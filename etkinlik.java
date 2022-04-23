import java.util.Scanner;

public class etkinlik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Hava sıcaklığını giriniz : ");
		int hava = scan.nextInt();

		if (hava < 5) {
			System.out.println("Kayak yapabilirsiniz.");
		} else if (hava < 15 && hava >= 5) {
			System.out.println("Sinemaya gidebilirsiniz.");
		} else if (hava >= 15 && hava < 25) {
			System.out.println("Piknik yapabilirsiniz.");
		} else {
			System.out.println("Yüzmeye gidebilirsiniz");
		}

	}

}
