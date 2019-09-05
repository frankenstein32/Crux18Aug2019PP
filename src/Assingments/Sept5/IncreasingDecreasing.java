package Assingments.Sept5;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int prev = scn.nextInt();

		boolean isInrc = false;
		boolean isValid = true;

		for (int i = 1; i < n; i++) {

			int curr = scn.nextInt();

			if (prev < curr) {
				isInrc = true;
			} else if (prev > curr && isInrc) {
				isValid = false;
				break;
			} else if (prev == curr) {
				isValid = false;
				break;
			}

			prev = curr;

		}

		System.out.println(isValid);
	}

}
