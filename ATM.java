import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userName, password;
		int right = 3;
		int balance = 1500;
		int menu, money, money1;

		while (right > 0) {
			System.out.print("Kullanýcý Adý : ");
			userName = input.next();
			System.out.print("Parola : ");
			password = input.next();
			if (userName.equals("java") && password.equals("dev123")) {
				System.out.println("Merhaba.Kodluyoruz Bankasýna Hoþ Geldiniz.");
				do {
					System.out.print(
							"1-Para Yatýrma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çýkýþ\nYapmak istediðiniz iþlemi seçiniz : ");
					menu = input.nextInt();
					switch (menu) {
					case 1:
						System.out.print("Para Miktarý : ");
						money = input.nextInt();
						balance += money;
						System.out.println("Yeni Bakiyeniz : " + balance);
						break;
					case 2:
						System.out.print("Çekmek istediðiniz miktar : ");
						money1 = input.nextInt();
						if (balance < money1) {
							System.out.println("Bakiyeniz yetersiz");
						} else {
							balance -= money1;
							System.out.println("Yeni Bakiyeniz : " + balance);
						}
						break;
					case 3:
						System.out.println("Güncel Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("Çýkýþ yapýlýyor. Tekrar görüþmek üzere.");
						System.exit(right);
						break;
					}
					System.out.print("Yeni bir iþlem yapmak istiyor musunuz? e/h : ");
					String yeniden = input.next();
					if (yeniden.equalsIgnoreCase("e"))
						continue;
					if (yeniden.equalsIgnoreCase("h"))
						System.out.println("Çýkýþ yapýlýyor. Tekrar görüþmek üzere.");
					System.exit(right);
				} while (menu != 4);
				System.out.println("Çýkýþ Yapýlýyor.Tekrar görüþmek üzere.");
				System.exit(right);
				break;
			} else {
				right--;
				System.out.println("Kulanýzý adý veya parolanýz yanlýþ!");
				if (right == 0) {
					System.out.println("Hesabýnýz bloke oldu.Bankanýz ile iletiþime geçiniz.");
				} else {
					System.out.println("Kalan Hakkýnýz : " + right);
				}
			}
		}
	}

}
