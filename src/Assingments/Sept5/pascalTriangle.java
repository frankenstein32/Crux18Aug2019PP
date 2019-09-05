package Assingments.Sept5;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(ncr(4, 2));

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int rows = 1;

		while (rows <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print(ncr(rows - 1, cst - 1) + "\t");
				cst++;
			}

			System.out.println();
			rows++;
			nst++;

		}
	}

	public static int ncr(int n, int r) {

		r = Math.min(r, n - r);

		int res = 1;
		for (int i = 0; i < r; i++) {

			res = res * (n - i) / (i + 1);
		}

		return res;

	}

}
