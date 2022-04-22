import java.util.Scanner;

public class HipotenusBulma {

	public static void main(String[] args) {
		//Java ile kullanýcýdan dik kenarlarýnýn uzunluðunu alan ve hipotenüsü hesaplayan programý yazýn.
        //Üçgenin alanýný hesaplatýn.


		Scanner scan = new Scanner(System.in);

		System.out.print("Üçgenin ilk kenarýný giriniz : ");
		int a = scan.nextInt();
		System.out.print("Üçgenin ikinci kenarýný giriniz : ");
		int b = scan.nextInt();

		int c = (a * a) + (b * b);
		System.out.println("Hipotenüs :" + Math.sqrt(c));

		int alan = (a * b) / 2;
		System.out.println("Üçgenin alaný : " + alan);

	}

}
