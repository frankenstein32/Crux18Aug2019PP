package Lec2;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			row++;
		}
	}

}
