import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userName, password;
		int right = 3;
		int balance = 1500;
		int menu, money, money1;

		while (right > 0) {
			System.out.print("Kullan�c� Ad� : ");
			userName = input.next();
			System.out.print("Parola : ");
			password = input.next();
			if (userName.equals("java") && password.equals("dev123")) {
				System.out.println("Merhaba.Kodluyoruz Bankas�na Ho� Geldiniz.");
				do {
					System.out.print(
							"1-Para Yat�rma\n2-Para �ekme\n3-Bakiye Sorgulama\n4-��k��\nYapmak istedi�iniz i�lemi se�iniz : ");
					menu = input.nextInt();
					switch (menu) {
					case 1:
						System.out.print("Para Miktar� : ");
						money = input.nextInt();
						balance += money;
						System.out.println("Yeni Bakiyeniz : " + balance);
						break;
					case 2:
						System.out.print("�ekmek istedi�iniz miktar : ");
						money1 = input.nextInt();
						if (balance < money1) {
							System.out.println("Bakiyeniz yetersiz");
						} else {
							balance -= money1;
							System.out.println("Yeni Bakiyeniz : " + balance);
						}
						break;
					case 3:
						System.out.println("G�ncel Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("��k�� yap�l�yor. Tekrar g�r��mek �zere.");
						System.exit(right);
						break;
					}
					System.out.print("Yeni bir i�lem yapmak istiyor musunuz? e/h : ");
					String yeniden = input.next();
					if (yeniden.equalsIgnoreCase("e"))
						continue;
					if (yeniden.equalsIgnoreCase("h"))
						System.out.println("��k�� yap�l�yor. Tekrar g�r��mek �zere.");
					System.exit(right);
				} while (menu != 4);
				
			} else {
				right--;
				System.out.println("Kulan�z� ad� veya parolan�z yanl��!");
				if (right == 0) {
					System.out.println("Hesab�n�z bloke oldu.Bankan�z ile ileti�ime ge�iniz.");
				} else {
					System.out.println("Kalan Hakk�n�z : " + right);
				}
			}
		}
	}

}
