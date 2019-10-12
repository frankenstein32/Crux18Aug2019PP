package Lec15;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPrimes(100000);
	}

	public static void printPrimes(int n) {

		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

//			if (primes[table] == false) {
//				continue;
//			}
			for (int mult = table; table * mult <= n; mult++) {
				primes[table * mult] = false;
			}
		}

		for (int i = 2; i <= n; i++) {

			if (primes[i] == true) {
				System.out.print(i + " ");
			}
		}

	}

}
