import java.util.Scanner;

public class NotOrtalama {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int mat, fizik, kimya, turkce, tarih, muzik;

		System.out.print("Matematik notunuzu giriniz : ");
		mat = scan.nextInt();
		System.out.println("Fizik notunuzu giriniz : ");
		fizik = scan.nextInt();
		System.out.println("Kimya notunuzu giriniz : ");
		kimya = scan.nextInt();
		System.out.println("Türkçe notunuzu giriniz : ");
		turkce = scan.nextInt();
		System.out.println("Tarih notunuzu giriniz : ");
		tarih = scan.nextInt();
		System.out.println("Müzik notunuzu giriniz : ");
		muzik = scan.nextInt();

		double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Not ortalamanýz : " + ortalama);
		String sonuc = (ortalama >= 60) ? "Sýnýfý Geçti. " : "Sýnýfta Kaldý. ";
		System.out.println(sonuc);
	}

}
