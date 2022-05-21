public class AsalSayi {

	public static void main(String[] args) {

		int sayac = 0;

		for (int i = 2; i <= 100; i++) {
			int bolen = 0;
			for (int a = 2; a < i; a++) {
				if (i % a == 0) {
					bolen = 1;
					break;
				}

			}
			if (bolen == 0) {
				System.out.print(i + " , ");
				sayac++;
			}

		}
	}
}
