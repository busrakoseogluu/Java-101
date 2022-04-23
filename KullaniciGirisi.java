import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		/*
		 * E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n�
		 * sorun, e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i
		 * ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , �ifreler ayn�
		 * ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." sorun yoksa
		 * "�ifre olu�turuldu" yazan program� yaz�n�z.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Kullan�c� Ad� : ");
		String kAdi = scan.next();
		System.out.print("Parola : ");
		String parola = scan.next();

		if (kAdi.equals("java") && parola.equals("123")) {
			System.out.println("Giri� ba�ar�l�.");
		} else if (!kAdi.equals("java") && parola.equals("123")) {
			System.out.println("Kullan�c� ad� hatal�.");
		} else if (kAdi.equals("java") && !parola.equals("123")) {
			System.out.println("�ifre hatal�.\n�ifre de�i�tirmek istiyorsan�z 1'e bas�n�z.");
			byte secim = scan.nextByte();
			if(secim==1) {
				System.out.println("Yeni �ifre : ");
				String yeni=scan.next();
				if (yeni.equals("123")) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				} else {
					System.out.println("�ifre olu�turuldu");
				}
			}else {
				System.out.println("Hatal� i�lem yapt�n�z.");
			}
		} else {
			System.out.println("Bilgileriniz hatal�. Tekrar deneyiniz. ");
		}
	}

}
