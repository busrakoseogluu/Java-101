import java.util.Scanner;

public class DaireDilimininAlani {

	public static void main(String[] args) {

		/*
		 * Yar��ap� r, merkez a��s�n�n �l��s� alfa olan daire diliminin alan� bulan
		 * program� yaz�n�z. pi say�s�n� = 3.14 al�n�z. Form�l : (pi * (r*r) * alfa) /
		 * 360
		 */

		Scanner scan = new Scanner(System.in);
		double alan, pi = 3.14;
		int r, alfa;

		System.out.print("Yar��ap� giriniz : ");
		r = scan.nextInt();
		System.out.print("Daire diliminin merkez a��s�n�n �l��s�n� giriniz : ");
		alfa = scan.nextInt();

		alan = (pi * (r * r) * alfa) / 360;
		System.out.println("Daire diliminin alan� : " + alan);
	}

}
