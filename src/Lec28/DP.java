package Lec28;

import java.util.Arrays;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(fibonacci(6));
//		System.out.println(fiboBU(6));
//		System.out.println(fiboBUSE(6));

//		System.out.println(boardPath(0, 10));
//		System.out.println(boardPathTD(0, 10, new int[11]));
//		System.out.println(boardPathBU(0, 10));
//		System.out.println(boardPathBUSE(0, 10));

//		System.out.println(fibonacci2(100, new int[101]));

		String s1 = "hfksjjkdshfkjsdhkjfhsdkjfdhfkjsdhfksdjfhkdsjabcd";
		String s2 = "lkdjfd,fnsjdkfhkjsdhfkjksjfkdjfkdjdkjfdkjafd";
//		System.out.println(LCS(s1, s2));

//		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
//
//		for (int[] s : strg) {
//
//			Arrays.fill(s, -1);
//
//		}
//		System.out.println(LCSTD(s1, s2, strg));
//		System.out.println(LCSBU(s1, s2));

//		System.out.println(EditDistance(s1, s2));
//		System.out.println(EditDistanceTD(s1, s2, strg));
//		System.out.println(EditDistanceBU(s1, s2));

		int[] wines = { 2, 3, 5, 1, 4 };
//		int n = wines.length;
//		System.out.println(wineProblem(wines, 0, n - 1, 1));

//		System.out.println(mazePathBU(3, 3));
//		System.out.println(mazePathBUSE_Dia(3, 3));
//		System.out.println(wineProblem2TD(wines, 0, n - 1, new int[n][n]));
//		System.out.println(wineproblemBU(wines));

//		int[] matrix = { 1, 2, 3, 4, 5 };
//		int n = matrix.length;
//		System.out.println(MCM(matrix, 0, matrix.length - 1));
//		System.out.println(MCMTD(matrix, 0, matrix.length - 1, new int[n][n]));
//		System.out.println(MCMBU(matrix));

//		int[] w = { 5, 3, 2, 4, 5 };
//		int[] p = { 3, 5, 2, 2, 1 };
//
//		System.out.println(Knapsack(p, w, 0, 9));
//		System.out.println(KnapsackTD(p, w, 0, 9, new int[w.length + 1][10]));
//		System.out.println(KnapsackBU(w, p, 9));

		int cr = 0;
		int cc = 1;
		int er = 1;
		int ec = 3;
		int K = 3;

//		int[][][] strg = new int[K + 1][er][ec];
//
//		System.out.println(boundaryPath(cr, cc, er, ec, K));
//		System.out.println(boundaryPathTD(cr, cc, er, ec, K, strg));

//		int[] p = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
//
//		int[] strg = new int[p.length];
//		System.out.println(rodCutting(p, p.length - 1));
//		System.out.println(rodCuttingTD(p, p.length - 1, strg));
		
		
		
		System.out.println((-1)/2);
		

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
		strg[1] = 1;

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

				strg[row][col] = strg[row + 1][col] + strg[row][col + 1] + strg[row + 1][col + 1];

			}
		}

		return strg[0][0];

	}

	public static int mazePathBUSE(int er, int ec) {

		int[] strg = new int[ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					strg[col] = 1;
					continue;
				}

				strg[col] = strg[col] + strg[col + 1];

			}
		}

		return strg[0];

	}

	public static int mazePathBUSE_Dia(int er, int ec) {

		int[] strg = new int[ec + 2];

		for (int row = er; row >= 0; row--) {
			int dia = 0;
			for (int col = ec; col >= 0; col--) {
				int temp = strg[col];
				if (row == er && col == ec) {
					strg[col] = 1;
					continue;
				}

				strg[col] = strg[col] + strg[col + 1] + dia;

				dia = temp;

			}
		}

		return strg[0];

	}

	public static int LCS(String s1, String s2) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {

			ans = LCS(ros1, ros2) + 1;
		} else {

			int fp = LCS(s1, ros2);
			int sp = LCS(ros1, s2);

			ans = Math.max(fp, sp);
		}

		return ans;

	}

	public static int LCSTD(String s1, String s2, int[][] strg) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 == 0 || l2 == 0) {
			return 0;
		}

		if (strg[l1][l2] != -1) {
			return strg[l1][l2];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {

			ans = LCSTD(ros1, ros2, strg) + 1;
		} else {

			int fp = LCSTD(s1, ros2, strg);
			int sp = LCSTD(ros1, s2, strg);

			ans = Math.max(fp, sp);
		}

		return strg[l1][l2] = ans;

	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {

				if (row == s1.length() || col == s2.length()) {
					strg[row][col] = 0;
					continue;
				}
				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);
				int ans = 0;
				if (ch1 == ch2) {

					ans = strg[row + 1][col + 1] + 1;
				} else {
					ans = Math.max(strg[row + 1][col], strg[row][col + 1]);
				}
				strg[row][col] = ans;
			}

		}

		return strg[0][0];
	}

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			ans = EditDistance(ros1, ros2);
		} else {

			int i = EditDistance(s1, ros2);
			int r = EditDistance(ros1, ros2);
			int d = EditDistance(ros1, s2);

			ans = Math.min(i, Math.min(r, d)) + 1;
		}

		return ans;

	}

	public static int EditDistanceTD(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;

		if (ch1 == ch2) {

			ans = EditDistanceTD(ros1, ros2, strg);
		} else {

			int i = EditDistanceTD(s1, ros2, strg);
			int r = EditDistanceTD(ros1, ros2, strg);
			int d = EditDistanceTD(ros1, s2, strg);

			ans = Math.min(i, Math.min(r, d)) + 1;
		}

		return strg[s1.length()][s2.length()] = ans;

	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}
				char ch1 = s1.charAt(row);
				char ch2 = s2.charAt(col);
				int ans = 0;
				if (ch1 == ch2) {
					ans = strg[row + 1][col + 1];
				} else {
					int i = strg[row][col + 1];
					int d = strg[row + 1][col];
					int r = strg[row + 1][col + 1];
					ans = Math.min(i, Math.min(d, r)) + 1;
				}
				strg[row][col] = ans;
			}
		}
		return strg[0][0];

	}

	public static int wineProblem(int[] wines, int si, int ei, int yr) {

		if (si == ei) {

			return wines[si] * yr;
		}

		int fh = wineProblem(wines, si + 1, ei, yr + 1) + wines[si] * yr;
		int sh = wineProblem(wines, si, ei - 1, yr + 1) + wines[ei] * yr;

		return Math.max(fh, sh);

	}

	public static int wineProblem2(int[] prices, int si, int ei) {

		int yr = prices.length - ei + si;
		if (si == ei) {

			return prices[si] * yr;
		}

		int fh = wineProblem2(prices, si + 1, ei) + prices[si] * yr;
		int sh = wineProblem2(prices, si, ei - 1) + prices[ei] * yr;

		return Math.max(fh, sh);

	}

	public static int wineProblem2TD(int[] prices, int si, int ei, int[][] strg) {

		int yr = prices.length - ei + si;
		if (si == ei) {
			return prices[si] * yr;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int fh = wineProblem2TD(prices, si + 1, ei, strg) + prices[si] * yr;
		int sh = wineProblem2TD(prices, si, ei - 1, strg) + prices[ei] * yr;

		return strg[si][ei] = Math.max(fh, sh);

	}

	public static int wineproblemBU(int[] wines) {

		int n = wines.length;
		int[][] strg = new int[n][n];

		for (int slide = 0; slide < n; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = slide + si;
				int yr = n - ei + si;
				if (si == ei) {
					strg[si][ei] = wines[si] * yr;
					continue;
				}
				int fh = strg[si + 1][ei] + wines[si] * yr;
				int sh = strg[si][ei - 1] + wines[ei] * yr;

				strg[si][ei] = Math.max(fh, sh);
			}
		}
		return strg[0][n - 1];

	}

	public static int MCM(int[] matrix, int si, int ei) {

		if (ei - si == 1) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k <= ei - 1; k++) {

			int fh = MCM(matrix, si, k);
			int sh = MCM(matrix, k, ei);

			int sw = matrix[si] * matrix[k] * matrix[ei];

			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}
		}

		return min;

	}

	public static int MCMTD(int[] matrix, int si, int ei, int[][] strg) {

		if (ei - si == 1) {
			return 0;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k <= ei - 1; k++) {

			int fh = MCMTD(matrix, si, k, strg);
			int sh = MCMTD(matrix, k, ei, strg);

			int sw = matrix[si] * matrix[k] * matrix[ei];

			int total = fh + sh + sw;

			if (total < min) {
				min = total;
			}
		}

		strg[si][ei] = min;

		return min;

	}

	public static int MCMBU(int[] matrix) {

		int n = matrix.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide < n; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = slide + si;

				if (ei - si == 1) {
					strg[si][ei] = 0;
					continue;
				}

				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k <= ei - 1; k++) {

					int fh = strg[si][k];
					int sh = strg[k][ei];

					int sw = matrix[si] * matrix[k] * matrix[ei];

					int total = fh + sh + sw;

					if (total < min) {
						min = total;
					}
				}

				strg[si][ei] = min;
			}
		}

		return strg[0][n - 1];
	}

	public static int Knapsack(int[] prices, int[] weight, int vidx, int cap) {

		if (vidx == weight.length) {
			return 0;
		}

		int exc = Knapsack(prices, weight, vidx + 1, cap);

		int inc = 0;

		if (weight[vidx] <= cap) {
			inc = Knapsack(prices, weight, vidx + 1, cap - weight[vidx]) + prices[vidx];
		}
		return Math.max(exc, inc);

	}

	public static int KnapsackTD(int[] prices, int[] weight, int vidx, int cap, int[][] strg) {

		if (vidx == weight.length) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}

		int exc = KnapsackTD(prices, weight, vidx + 1, cap, strg);

		int inc = 0;

		if (weight[vidx] <= cap) {
			inc = KnapsackTD(prices, weight, vidx + 1, cap - weight[vidx], strg) + prices[vidx];
		}

		return strg[vidx][cap] = Math.max(exc, inc);

	}

	public static int KnapsackBU(int[] w, int[] p, int cap) {

		int[] strg = new int[cap + 1];

		for (int vidx = w.length - 1; vidx >= 0; vidx--) {

			for (int c = cap; c >= 1; c--) {

				int inc = 0, exc = 0;

				exc = strg[c];

				if (w[vidx] <= c)
					inc = strg[c - w[vidx]] + p[vidx];

				strg[c] = Math.max(inc, exc);
			}
		}

		return strg[cap];

	}

	public static int boundaryPath(int cr, int cc, int er, int ec, int K) {

		if (cr < 0 || cr >= er || cc < 0 || cc >= ec) {
			return 1;
		}

		if (K == 0) {
			return 0;
		}

		int cnt = 0;

		// Smaller Problem
		cnt += boundaryPath(cr + 1, cc, er, ec, K - 1);
		cnt += boundaryPath(cr - 1, cc, er, ec, K - 1);
		cnt += boundaryPath(cr, cc + 1, er, ec, K - 1);
		cnt += boundaryPath(cr, cc - 1, er, ec, K - 1);

		return cnt;

	}

	public static int boundaryPathTD(int cr, int cc, int er, int ec, int K, int[][][] strg) {

		if (cr < 0 || cr >= er || cc < 0 || cc >= ec) {
			return 1;
		}

		if (K == 0) {
			return 0;
		}

		if (strg[K][cr][cc] != 0) {
			return strg[K][cr][cc];
		}

		int cnt = 0;

		// Smaller Problem
		cnt += boundaryPathTD(cr + 1, cc, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr - 1, cc, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr, cc + 1, er, ec, K - 1, strg);
		cnt += boundaryPathTD(cr, cc - 1, er, ec, K - 1, strg);

		strg[K][cr][cc] = cnt;
		return cnt;

	}

	public static int boundaryPathBU(int i, int j, int er, int ec, int K) {

		int[][][] strg = new int[K + 1][er][ec];

		for (int moves = 1; moves <= K; moves++) {

			for (int cr = er - 1; cr >= 0; cr--) {

				for (int cc = ec - 1; cc >= 0; cc--) {

					int cnt = 0;
					// Up
					if (cr - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr - 1][cc];
					}

					// Down
					if (cr + 1 >= er) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr + 1][cc];
					}

					// Left
					if (cc - 1 < 0) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr][cc - 1];
					}

					// Right
					if (cc + 1 >= ec) {
						cnt++;
					} else {
						cnt += strg[moves - 1][cr][cc + 1];
					}
//
//					int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };
//
//					for (int[] d : dirs) {
//
//						int row = cr + d[0];
//						int col = cc + d[1];
//
//						if (row < 0 || row >= er || col < 0 || cc >= ec) {
//							cnt++;
//						} else {
//							cnt += strg[moves - 1][row][col];
//						}
//					}

					strg[moves][cr][cc] = cnt;
				}
			}

		}

		return strg[K][i][j];

	}

	public static int rodCutting(int[] price, int len) {

		int left = 1;
		int right = len - 1;

		int max = price[len];

		while (left <= right) {

			int fp = rodCutting(price, left);
			int sp = rodCutting(price, right);

			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;

		}

		return max;

	}

	public static int rodCuttingTD(int[] price, int len, int[] strg) {

		if (strg[len] != 0) {
			return strg[len];
		}

		int left = 1;
		int right = len - 1;

		int max = price[len];

		while (left <= right) {

			int fp = rodCuttingTD(price, left, strg);
			int sp = rodCuttingTD(price, right, strg);

			int total = fp + sp;

			if (total > max) {
				max = total;
			}

			left++;
			right--;

		}

		strg[len] = max;
		return max;

	}

	public static int rodCuttingBU(int[] price) {

		int[] strg = new int[price.length];

		for (int len = 1; len < strg.length; len++) {

			int left = 1;
			int right = len - 1;

			int max = price[len];
			while (left <= right) {
				int fp = strg[left];
				int sp = strg[right];
				int total = fp + sp;

				if (total > max) {
					max = total;
				}
				left++;
				right--;
			}
			strg[len] = max;

		}

		return strg[price.length - 1];
	}

}
