import java.util.Scanner;

public class UcgeninAlaný {

	public static void main(String[] args) {
		
		//Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin alanýný hesaplayan programý yazýnýz.

		Scanner scan = new Scanner(System.in);

		System.out.print("Üçgenin ilk kenarýný giriniz : ");
		int a = scan.nextInt();
		System.out.println("Üçgenin ikinci kenarýný giriniz : ");
		int b = scan.nextInt();
		System.out.println("Üçgenin üçüncü kenarýný giriniz : ");
		int c = scan.nextInt();

		int u = (a + b + c) / 2;
		int alan = (u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alaný : " + Math.sqrt(alan));

	}

}
