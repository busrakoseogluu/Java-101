import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {

		/*
		 * Java ile gidilen mesafeye (KM) göre taksimetre tutarýný ekrana yazdýran
		 * programý yazýn.
		 * 
		 * Taksimetre KM baþýna 2.20 TL tutmaktadýr. Minimum ödenecek tutar 20 TL'dir.
		 * 20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr. Taksimetre açýlýþ ücreti
		 * 10 TL'dir.
		 */
		Scanner scan = new Scanner(System.in);
		
		int km, kmAcilis = 10;
		double kmUcret = 2.20, tutar;
		
		System.out.print("Gidilen mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();

		tutar = ((km * kmUcret) + 10);
		
		if(tutar < 20) {
			tutar = 20;
			System.out.println("Tutar : " + tutar);
		}else {
			System.out.println("Tutar : " + tutar);
		}

	}

}
