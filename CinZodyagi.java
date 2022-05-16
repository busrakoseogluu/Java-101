import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);

		System.out.print("Doğum yılınızı giriniz : ");
		int yil = scan.nextInt();

		int zodiac = yil % 12;

		if (zodiac == 0) {
			System.out.println("Maymun");
		} else if (zodiac == 1) {
			System.out.println("Horoz");
		} else if (zodiac == 2) {
			System.out.println("Köpek");
		} else if (zodiac == 3) {
			System.out.println("Domuz");
		} else if (zodiac == 4) {
			System.out.println("Fare");
		} else if (zodiac == 5) {
			System.out.println("Öküz");
		} else if (zodiac == 6) {
			System.out.println("Kaplan");
		} else if (zodiac == 7) {
			System.out.println("Tavşan");
		} else if (zodiac == 8) {
			System.out.println("Ejderha");
		} else if (zodiac == 9) {
			System.out.println("Yılan");
		} else if (zodiac == 10) {
			System.out.println("At");
		} else if (zodiac == 11) {
			System.out.println("Koyun");
		} else {
			System.out.println("Hatalı Veri Girdiniz ! Tekrar Deneyiniz !");
		}

	}

}
