package Lec2;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int rows = 1;
		int nst = 1;
		int nsp = n - 1;
//		int val = 0;
		while (rows <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			int val = rows;
			while (cst <= nst) {

				if (cst == 1 || cst == nst)
					System.out.print(val + " ");
				else {
					System.out.print("0 ");
				}
				cst++;
			}

			// updation
			System.out.println();
			nst += 2;
			nsp--;
			rows++;
		}
	}

}
