import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {

		/*
		 * Java ile yar��ap�n� kullan�c�dan ald���n�z dairenin alan�n� ve �evresini
		 * hesaplayan program� yaz�n.
		 * 
		 * Alan Form�l� : pi * r * r;
		 * 
		 * �evre Form�l� : 2 * pi * r;
		 */
		Scanner scan = new Scanner(System.in);

		int r;
		double pi = 3.14, alan, cevre;

		System.out.print("Dairenin yar��ap�n� giriniz : ");
		r = scan.nextInt();

		alan = (pi * r * r);
		cevre = (2 * pi * r);

		System.out.println("Dairenin alan� : " + alan + "\nDairenin �evresi : " + cevre);

	}

}
