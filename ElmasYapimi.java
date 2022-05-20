import java.util.Scanner;

public class ElmasYapimi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi giriniz : ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int a=1;a<=n;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			for(int c=n;c>a;c--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
