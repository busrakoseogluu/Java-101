import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mat, fizik, kimya, turkce, muzik, toplam = 0;
		double ortalama;

		System.out.println("Matematik notunuzu giriniz : ");
		mat = scan.nextInt();
		if (mat <= 100 && mat >= 0)
			toplam += mat;
		System.out.println("Fizik notunuzu giriniz : ");
		fizik = scan.nextInt();
		if (fizik <= 100 && fizik >= 0)
			toplam += fizik;
		System.out.println("Kimya notunuzu giriniz : ");
		kimya = scan.nextInt();
		if (kimya <= 100 && kimya >= 0)
			toplam += kimya;
		System.out.println("Türkçe notunuzu giriniz : ");
		turkce = scan.nextInt();
		if (turkce <= 100 && turkce >= 0)
			toplam += turkce;
		System.out.println("Müzik notunuzu giriniz : ");
		muzik = scan.nextInt();
		if (muzik <= 100 && muzik >= 0)
			toplam += muzik;

		ortalama = toplam / 5;
		System.out.println("Ortalamanýz : " + ortalama);
		
		if(ortalama >=55 ) {
			System.out.println("Sýnýfý geçtiniz.");
		}else {
			System.out.println("Sýnýfta Kaldýnýz.");
		}

	}

}
