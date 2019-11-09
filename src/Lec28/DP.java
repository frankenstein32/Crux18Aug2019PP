package Lec28;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(fibonacci(6));
//		System.out.println(fiboBU(6));
//		System.out.println(fiboBUSE(6));

		System.out.println(boardPath(0, 10));
		System.out.println(boardPathTD(0, 10, new int[11]));
		System.out.println(boardPathBU(0, 10));
		System.out.println(boardPathBUSE(0, 10));

//		System.out.println(fibonacci2(100, new int[101]));

	}

	public static int fibonacci(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		int f1 = fibonacci(n - 1);
		int f2 = fibonacci(n - 2);

		return f1 + f2;
	}

	public static int fiboTD(int n, int[] strg) {

		if (n == 1 || n == 0) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int f1 = fiboTD(n - 1, strg);
		int f2 = fiboTD(n - 2, strg);

		strg[n] = f1 + f2;

		return f1 + f2;
	}

	public static int fiboBU(int n) {

		int[] strg = new int[n + 1];

		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {

			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];

	}

	public static int fiboBUSE(int n) {

		int[] strg = new int[2];

		strg[0] = 0;
		strg[1] = 1;_

		for (int i = 0; i < n - 1; i++) {

			// Calculate sum
			int sum = strg[0] + strg[1];

			// Shifting
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];

	}

	public static int boardPath(int curr, int end) {

		if (curr == end) {

			return 1;
		}

		int cnt = 0;

		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			cnt += boardPath(curr + dice, end);
		}

		return cnt;

	}

	public static int boardPathTD(int curr, int end, int[] strg) {

		if (curr == end) {

			return 1;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int cnt = 0;

		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			cnt += boardPathTD(curr + dice, end, strg);
		}

		strg[curr] = cnt;

		return cnt;

	}

	public static int boardPathBU(int curr, int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;

		for (int i = end - 1; i >= curr; i--) {

//			for(int dice = 1;dice <= 6;dice++) {
//				strg[i] += strg[i + dice];
//			}

			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}

		return strg[0];

	}

	public static int boardPathBUSE(int curr, int end) {

		int[] strg = new int[6];

		strg[0] = 1;

		for (int i = 1; i <= end; i++) {

//			int sum = 0;
//			
//			for(int j = 0;j < 6;j++) {
//				sum += strg[j];
//			}

			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}

		return strg[0];

	}

	public static int mazePath(int cr, int cc, int ec, int er, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int cnt = 0;

		cnt += mazePath(cr + 1, cc, ec, er, strg);
		cnt += mazePath(cr, cc + 1, ec, er, strg);

		return strg[cr][cc] = cnt;
//		return strg[cr][cc];

	}

	public static int mazePathBU(int er, int ec) {

		int[][] strg = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {

			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					strg[row][col] = 1;
					continue;
				}

				strg[row][col] = strg[row + 1][col] + strg[row][col + 1];

			}
		}

		return strg[0][0];

	}

}
