import java.util.Scanner;

public class UcgeninAlanı {

	public static void main(String[] args) {
		
		//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

		Scanner scan = new Scanner(System.in);

		System.out.print("Üçgenin ilk kenarını giriniz : ");
		int a = scan.nextInt();
		System.out.print("Üçgenin ikinci kenarını giriniz : ");
		int b = scan.nextInt();
		System.out.print("Üçgenin üçüncü kenarını giriniz : ");
		int c = scan.nextInt();

		int u = (a + b + c) / 2;
		int alan = (u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alanı : " + Math.sqrt(alan));

	}

}
