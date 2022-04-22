import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {

		/*
		 * Yarýçapý r, merkez açýsýnýn ölçüsü alfa olan daire diliminin alaný bulan
		 * programý yazýnýz. pi sayýsýný = 3.14 alýnýz. Formül : (pi * (r*r) * alfa) /
		 * 360
		 */

		Scanner scan = new Scanner(System.in);
		double alan, pi = 3.14;
		int r, alfa;

		System.out.print("Yarýçapý giriniz : ");
		r = scan.nextInt();
		System.out.print("Daire diliminin merkez açýsýnýn ölçüsünü giriniz : ");
		alfa = scan.nextInt();

		alan = (pi * (r * r) * alfa) / 360;
		System.out.println("Daire diliminin alaný : " + alan);
	}

}
