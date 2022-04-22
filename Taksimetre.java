import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {

		/*
		 * Java ile gidilen mesafeye (KM) g�re taksimetre tutar�n� ekrana yazd�ran
		 * program� yaz�n.
		 * 
		 * Taksimetre KM ba��na 2.20 TL tutmaktad�r. Minimum �denecek tutar 20 TL'dir.
		 * 20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r. Taksimetre a��l�� �creti
		 * 10 TL'dir.
		 */
		Scanner scan = new Scanner(System.in);
		
		int km, kmAcilis = 10;
		double kmUcret = 2.20, tutar;
		
		System.out.print("Gidilen mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();

		tutar = ((km * kmUcret) + 10);
		
		if(tutar < 20) {
			tutar = 20;
			System.out.println("Tutar : " + tutar);
		}else {
			System.out.println("Tutar : " + tutar);
		}

	}

}
