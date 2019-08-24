package Lec2;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int rows = 1;
		int nst = n;
		int nsp = 0;

		while (rows <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {

				System.out.print("*");

				cst++;
			}

			// updation
			System.out.println();
			nst--;
			nsp++;
			rows++;
		}
	}

}
