import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Y�l giriniz : ");
		int yil=scan.nextInt();
		
		if(yil%4==0) {
			if(yil%100==0) {
				if(yil%400==0) {
					System.out.println(yil + " bir art�k y�ld�r.");
				}
			}
			System.out.println(yil + " bir art�k y�ld�r.");
		}else {
			System.out.println(yil + " bir art�k y�l de�ildir.");
		}
		
	}

}
