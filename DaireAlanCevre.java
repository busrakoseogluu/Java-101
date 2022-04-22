import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {

		/*
		 * Java ile yarýçapýný kullanýcýdan aldýðýnýz dairenin alanýný ve çevresini
		 * hesaplayan programý yazýn.
		 * 
		 * Alan Formülü : pi * r * r;
		 * 
		 * Çevre Formülü : 2 * pi * r;
		 */
		Scanner scan = new Scanner(System.in);

		int r;
		double pi = 3.14, alan, cevre;

		System.out.print("Dairenin yarýçapýný giriniz : ");
		r = scan.nextInt();

		alan = (pi * r * r);
		cevre = (2 * pi * r);

		System.out.println("Dairenin alaný : " + alan + "\nDairenin çevresi : " + cevre);

	}

}
