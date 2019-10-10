package Assingments.oct10;

import java.util.Scanner;

public class BostonNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(isBoston(n));
	}

	public static int isBoston(int num) {

		int digitSum = sumofdigits(num);
		int sumOfFactors = 0;

		for (int i = 2; i * i <= num; i++) {

			if (isPrime(i)) {

				while (num % i == 0) {

					sumOfFactors += sumofdigits(i);
					num /= i;
				}
			}
		}

		if (num > 1) {
			sumOfFactors += sumofdigits(num);
		}

		if (sumOfFactors == digitSum) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int sumofdigits(int num) {

		int sum = 0;

		while (num != 0) {

			sum += num % 10;
			num /= 10;
		}

		return sum;

	}

	public static boolean isPrime(int n) {

		int i = 2;
		while (i * i <= n) {

			if (n % i == 0) {
				return false;
			}

			i++;
		}

		return true;

	}

}
