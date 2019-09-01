package Lec5;

import java.util.Scanner;

public class FunctionOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		// printAllPrimes(n1, n2);
		printAllArmstrong(n1, n2);

	}

	public static void printAllPrimes(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isPrime(i);

			if (res == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {

		for (int div = 2; div <= n - 1; div++) {
			if (n % div == 0) {
				return false;
			}
		}

		return true;

	}

	public static void printAllArmstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isArmstrong(i);

			if (res == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int n) {

		int nod = numberOfDigits(n);

		int temp = n;
		int ans = 0;
		while (n != 0) {

			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}

		if (temp == ans) {
			return true;
		} else {
			return false;
		}

	}

	public static int numberOfDigits(int n) {

		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		return count;
	}
}