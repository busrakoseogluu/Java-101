import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		/*
		 * C(n,r) = n! / (r! * (n-r)!)
		 */
		Scanner scan = new Scanner(System.in);
		int f = 1,f1=1,f2=1;
		System.out.print("Eleman Sayısı (n) : ");
		int n = scan.nextInt();
		System.out.print("Seçim Sayısı (r) : ");
		int r = scan.nextInt();

		if((n>0 && r>0) && n>=r) {
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		for(int i=1;i<=r;i++) {
			f1=f1*i;
		}
		for (int i = 1; i <= n-r; i++) {
			f2=f2*i;
		}
		int factorial=f/(f1*f2);
		System.out.println(factorial);
		}else {
			System.out.println("n r'den büyük olmalı!");
		}
	}
}
