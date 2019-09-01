package Lec5;

public class PrintAllPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPrimes(5, 27);
	}

	public static void printPrimes(int ll, int ul) {

		for (int i = ll; i <= ul; i++) {

			boolean ans = isPrime(i);

			if (ans == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {

		int i = 1;
		int fact = 0;

		while (i <= n) {

			if (n % i == 0) {
				fact++;
			}

			i++;
		}

		if (fact == 2) {
			return true;
		}
		return false;

	}

}
