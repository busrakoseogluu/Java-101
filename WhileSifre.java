import java.util.Scanner;

public class WhileSifre {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int password = 123;
		boolean isPasswordSuccess = false;

		while (!isPasswordSuccess) {
			System.out.print("Þifre : ");
			password = scan.nextInt();
			if (password == 123) {
				System.out.println("Doðru");
				isPasswordSuccess = true;
			} else {
				System.out.println("Yanlýþ");
			}
		}
		
		
	}

}
