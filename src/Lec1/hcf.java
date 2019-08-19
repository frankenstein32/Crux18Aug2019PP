package Lec1;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int f = 1;
		int min = 0;

		// if else
		if (n1 < n2) {
			min = n1;
		} else {
			min = n2;
		}

		int gcd = 0;

		// builtin
//		min = Math.min(n1, n2);

		while (f <= min) {

			if (n1 % f == 0 && n2 % f == 0) {
				gcd = f;

			}

			f++;
		}

		System.out.println(gcd);

	}

}
