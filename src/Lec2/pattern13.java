package Lec2;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int rows = 1;
		int nst = 1;

		while (rows <= 2 * n - 1) {

			int val = rows;

			if (rows > n) {
				val = 2 * n - rows;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 1)
					System.out.print(val);
				else
					System.out.print("*");
				cst++;
			}

			// updation
			System.out.println();

			if (rows < n) {
				nst += 2;
				val++;
			} else {
				nst -= 2;
				val--;
			}

			rows++;
		}
	}

}
