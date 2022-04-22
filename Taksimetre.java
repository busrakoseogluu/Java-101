import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {

		/*
		 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
		 * programı yazın.
		 * 
		 * Taksimetre KM başına 2.20 TL tutmaktadır. Minimum ödenecek tutar 20 TL'dir.
		 * 20 TL altında ki ücretlerde yine 20 TL alınacaktır. Taksimetre açılış ücreti
		 * 10 TL'dir.
		 */
		Scanner scan = new Scanner(System.in);
		
		int  kmAcilis = 10;
		double km, kmUcret = 2.20, tutar;
		
		System.out.print("Gidilen mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();

		tutar = ((km * kmUcret) + 10);
		
		if(tutar < 20) {
			tutar = 20;
			System.out.println("Tutar : " + tutar + " $ ");
		}else {
			System.out.println("Tutar : " + tutar + " $ ");
		}

	}

}
