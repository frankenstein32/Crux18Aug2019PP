package Lec5;

public class PrintAllArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printArmstrong(1, 1000);
	}

	public static void printArmstrong(int ll, int ul) {

		for (int i = ll; i <= ul; i++) {

			boolean ans = isArmStrong(i);
			if (ans == true) {
				System.out.println(i);
			}

		}
	}

	public static boolean isArmStrong(int n) {

		int d = nod(n);
		int temp = n;
		int ans = 0;
		while (n > 0) {

			int rem = n % 10;

			ans = ans + (int) Math.pow(rem, d);

			n = n / 10;

		}

		if (ans == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static int nod(int n) {

		int digits = 0;
		while (n > 0) {

			digits++;
			n = n / 10;
		}

		return digits;

	}

}
