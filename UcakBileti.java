import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		/*
		 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
		 * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
		 * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
		 * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
		 * aşağıdaki indirimleri uygulayın ;
		 * 
		 * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
		 * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
		 * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir. Kişi 12 yaşından
		 * küçükse bilet fiyatı üzerinden %50 indirim uygulanır. Kişi 12-24 yaşları
		 * arasında ise bilet fiyatı üzerinden %10 indirim uygulanır. Kişi 65 yaşından
		 * büyük ise bilet fiyatı üzerinden %30 indirim uygulanır. Kişi
		 * "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim
		 * uygulanır.
		 */
		Scanner scan = new Scanner(System.in);

		double ucret, yasİnd = 0, tipİnd;
		int km, yas, tip;

		System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		yas = scan.nextInt();
		System.out.print("1-Tek Yön\n2-Gidiş Dönüş\nYolculuk tipinizi seçiniz : ");
		tip = scan.nextInt();

		ucret = km * 0.1;

		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
			if (yas < 12) {
				yasİnd = ucret * 0.5;
			} else if (yas < 24 && yas > 12) {
				yasİnd = ucret * 0.1;
			} else if (yas > 65) {
				yasİnd = ucret * 0.3;
			}
			ucret -= yasİnd;
			if (tip == 2) {
				tipİnd = ucret * 0.2;
				ucret -= tipİnd;
				ucret*=2;
			}
			System.out.println("Yolculuk Ücretiniz : " + ucret + " TL ");

		} else {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}

	}

}
