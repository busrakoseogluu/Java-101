import java.util.Scanner;

public class UcgeninAlan� {

	public static void main(String[] args) {
		
		//�� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin alan�n� hesaplayan program� yaz�n�z.

		Scanner scan = new Scanner(System.in);

		System.out.print("��genin ilk kenar�n� giriniz : ");
		int a = scan.nextInt();
		System.out.println("��genin ikinci kenar�n� giriniz : ");
		int b = scan.nextInt();
		System.out.println("��genin ���nc� kenar�n� giriniz : ");
		int c = scan.nextInt();

		int u = (a + b + c) / 2;
		int alan = (u * (u - a) * (u - b) * (u - c));
		System.out.println("��genin alan� : " + Math.sqrt(alan));

	}

}
