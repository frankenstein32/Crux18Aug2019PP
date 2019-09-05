package Assingments.Sept5;

import java.util.Scanner;

public class ChewbaccaNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		long ans = 0;
		long mult = 1;

		while (n > 0) {

			long rem = n % 10;

			if (n < 10 && n == 9) {

			} else if (rem >= 5) {
				rem = 9 - rem;
			}

			ans = ans + rem * mult;
			mult = mult * 10;

			n = n / 10;
		}

		System.out.println(ans);
	}

}
