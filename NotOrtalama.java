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
		System.out.println("T�rk�e notunuzu giriniz : ");
		turkce = scan.nextInt();
		System.out.println("Tarih notunuzu giriniz : ");
		tarih = scan.nextInt();
		System.out.println("M�zik notunuzu giriniz : ");
		muzik = scan.nextInt();

		double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Not ortalaman�z : " + ortalama);
		String sonuc = (ortalama >= 60) ? "S�n�f� Ge�ti. " : "S�n�fta Kald�. ";
		System.out.println(sonuc);
	}

}
