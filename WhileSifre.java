import java.util.Scanner;

public class WhileSifre {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int password = 123;
		boolean isPasswordSuccess = false;

		while (!isPasswordSuccess) {
			System.out.print("Şifre : ");
			password = scan.nextInt();
			if (password == 123) {
				System.out.println("Doğru");
				isPasswordSuccess = true;
			} else {
				System.out.println("Yanlış");
			}
		}
		
		
	}

}
