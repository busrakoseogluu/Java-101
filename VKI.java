import java.util.Scanner;

public class VKI {

	public static void main(String[] args) {

		/*
		 * Java ile kullan�c�dan boy ve kilo de�erlerini al�p bir de�i�kene atay�n.
		 * A�a��daki form�le g�re kullan�c�n�n "V�cut Kitle �ndeks" de�erini hesaplay�p
		 * ekrana yazd�r�n. Form�l Kilo (kg) / Boy(m) * Boy(m)
		 */

		Scanner scan = new Scanner(System.in);

		double boy, kilo, vki;
		
		System.out.print("Boyunuzu m cinsinden giriniz : ");
		boy=scan.nextDouble();
		System.out.print("Kilonuzu giriniz : ");
        kilo=scan.nextDouble();
        
        vki=kilo/(boy*boy);
        System.out.println("V�cut kitle indeksiniz : " + vki);
		
	}

}
