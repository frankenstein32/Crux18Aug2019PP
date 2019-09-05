package Assingments.Sept5;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = 1;
		int nsp1 = n - 1;
		int nsp2 = -1;

		int rows = 1;

		while (rows <= n) {

			int val = rows;
			if (rows > n / 2 + 1) {
				val = n - rows + 1;
			}
			int csp = 1;
			while (csp <= nsp1) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print(val+" ");
				val--;
				cst++;
			}

			csp = 1;
			while (csp <= nsp2) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			val = 1;
			if (rows == 1 || rows == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print(val+" ");
				val++;
				cst++;
			}

			System.out.println();

			if (rows <= n / 2) {
				nst++;
				nsp1 -= 2;
				nsp2 += 2;
			} else {

				nst--;
				nsp1 += 2;
				nsp2 -= 2;
			}
			rows++;

		}
	}

}
