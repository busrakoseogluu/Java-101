import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yıl giriniz : ");
		int yil=scan.nextInt();
		
		if(yil%4==0) {
			if(yil%100==0) {
				if(yil%400==0) {
					System.out.println(yil + " bir artık yıldır.");
				}
			}
			System.out.println(yil + " bir artık yıldır.");
		}else {
			System.out.println(yil + " bir artık yıl değildir.");
		}
		
	}

}
