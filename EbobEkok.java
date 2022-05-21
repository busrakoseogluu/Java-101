import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ebob = 1, ekok = 1, i = 1, j = 1;
		System.out.print("Ýlk sayýyý giriniz : ");
		int n = scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz : ");
		int m = scan.nextInt();

		//for(int i=1;<=m;i++){
		// 
		while (i<=m) {
			if (n % i == 0 && m % i == 0) {
				ebob = i;
			}
			i++;
			if (n % j == 0 && m % j == 0) {
				ekok=n*m/ebob;
			}
			j++;
			
		}
		System.out.println("Ebob : " + ebob);
		System.out.println("Ekok : " + ekok);
	}

}
