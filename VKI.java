import java.util.Scanner;

public class VKI {

	public static void main(String[] args) {

		/*
		 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
		 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
		 * ekrana yazdırın. Formül Kilo (kg) / Boy(m) * Boy(m)
		 */

		Scanner scan = new Scanner(System.in);

		double boy, kilo, vki;
		
		System.out.print("Boyunuzu m cinsinden giriniz : ");
		boy=scan.nextDouble();
		System.out.print("Kilonuzu giriniz : ");
                kilo=scan.nextDouble();
        
                vki=kilo/(boy*boy);
                System.out.println("Vücut kitle indeksiniz : " + vki);
		
	}

}
