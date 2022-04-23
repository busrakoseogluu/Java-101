import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		/*
		 * Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný
		 * sorun, eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði
		 * ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , þifreler ayný
		 * ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz." sorun yoksa
		 * "Þifre oluþturuldu" yazan programý yazýnýz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Kullanýcý Adý : ");
		String kAdi = scan.next();
		System.out.print("Parola : ");
		String parola = scan.next();

		if (kAdi.equals("java") && parola.equals("123")) {
			System.out.println("Giriþ baþarýlý.");
		} else if (!kAdi.equals("java") && parola.equals("123")) {
			System.out.println("Kullanýcý adý hatalý.");
		} else if (kAdi.equals("java") && !parola.equals("123")) {
			System.out.println("Þifre hatalý.\nÞifre deðiþtirmek istiyorsanýz 1'e basýnýz.");
			byte secim = scan.nextByte();
			if(secim==1) {
				System.out.println("Yeni þifre : ");
				String yeni=scan.next();
				if (yeni.equals("123")) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				} else {
					System.out.println("Þifre oluþturuldu");
				}
			}else {
				System.out.println("Hatalý iþlem yaptýnýz.");
			}
		} else {
			System.out.println("Bilgileriniz hatalý. Tekrar deneyiniz. ");
		}
	}

}
