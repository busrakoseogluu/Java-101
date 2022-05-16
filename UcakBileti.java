import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		/*
		 * Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program�
		 * yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��)
		 * bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak
		 * u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye
		 * a�a��daki indirimleri uygulay�n ;
		 * 
		 * Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�,
		 * yolculuk tipi ise 1 veya 2) olmal�d�r. Aksi takdirde kullan�c�ya
		 * "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir. Ki�i 12 ya��ndan
		 * k���kse bilet fiyat� �zerinden %50 indirim uygulan�r. Ki�i 12-24 ya�lar�
		 * aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r. Ki�i 65 ya��ndan
		 * b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r. Ki�i
		 * "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim
		 * uygulan�r.
		 */
		Scanner scan = new Scanner(System.in);

		double ucret, yas�nd = 0, tip�nd;
		int km, yas, tip;

		System.out.print("Gidece�iniz mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();
		System.out.print("Ya��n�z� giriniz : ");
		yas = scan.nextInt();
		System.out.print("1-Tek Y�n\n2-Gidi� D�n��\nYolculuk tipinizi se�iniz : ");
		tip = scan.nextInt();

		ucret = km * 0.1;

		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
			if (yas < 12) {
				yas�nd = ucret * 0.5;
			} else if (yas < 24 && yas > 12) {
				yas�nd = ucret * 0.1;
			} else if (yas > 65) {
				yas�nd = ucret * 0.3;
			}
			ucret -= yas�nd;
			if (tip == 2) {
				tip�nd = ucret * 0.2;
				ucret -= tip�nd;
				ucret*=2;
			}
			System.out.println("Yolculuk �cretiniz : " + ucret + " TL ");

		} else {
			System.out.println("Hatal� Veri Girdiniz ! ");
		}

	}

}
