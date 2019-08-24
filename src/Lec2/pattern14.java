package Lec2;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int rows = 1;
		int nst = 1;
		int nsp = n - 1;

		while (rows <= 2 * n - 1) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// updation
			System.out.println();

			if (rows < n) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}

			rows++;
		}
	}

}
