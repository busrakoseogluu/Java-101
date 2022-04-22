import java.util.Scanner;

public class KdvTutar {

	public static void main(String[] args) {
		/*
		 * Java ile kullanýcýdan alýnan para deðerinin KDV'li fiyatýný ve KDV tutarýný
		 * hesaplayýp ekrana bastýran programý yazýn.
		 * 
		 * (Not : KDV tutarýný 18% olarak alýn)
		 * 
		 * KDV'siz Fiyat = 10;
		 * 
		 * KDV'li Fiyat = 11.8;
		 * 
		 * KDV tutarý = 1.8;
		 * 
		 * Ödev Eðer girilen tutar 0 ve 1000 TL arasýnda ise KDV oraný %18 , tutar 1000
		 * TL'den büyük ise KDV oranýný %8 olarak KDV tutarý hesaplayan programý
		 * yazýnýz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Hesaplanacak tutarý giriniz : ");
		int sayi = scan.nextInt();

		double kdv;

		if (sayi <= 1000 && sayi >= 0) {
			kdv = 0.18;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oraný : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutarý : " + sayi * kdv);

		} else {
			kdv = 0.08;
			System.out.println("KDV'siz fiyat : " + sayi);
			System.out.println("KDV oraný : " + kdv);
			System.out.println("KDV'li fiyat : " + (sayi + (sayi * kdv)));
			System.out.println("KDV tutarý : " + sayi * kdv);

		}

	}

}
