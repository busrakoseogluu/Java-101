import java.util.Scanner;

public class HipotenusBulma {

	public static void main(String[] args) {
		//Java ile kullan�c�dan dik kenarlar�n�n uzunlu�unu alan ve hipoten�s� hesaplayan program� yaz�n.
        //��genin alan�n� hesaplat�n.


		Scanner scan = new Scanner(System.in);

		System.out.print("��genin ilk kenar�n� giriniz : ");
		int a = scan.nextInt();
		System.out.print("��genin ikinci kenar�n� giriniz : ");
		int b = scan.nextInt();

		int c = (a * a) + (b * b);
		System.out.println("Hipoten�s :" + Math.sqrt(c));

		int alan = (a * b) / 2;
		System.out.println("��genin alan� : " + alan);

	}

}
