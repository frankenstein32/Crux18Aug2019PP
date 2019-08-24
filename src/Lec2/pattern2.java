package Lec2;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int rows = 1;
		int nst = 1;

		while (rows <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// updation
			System.out.println();
			nst++;
			rows++;
		}
	}

}
