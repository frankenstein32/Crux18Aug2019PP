package Lec12;

public class BackTracking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		queenPrmt(new boolean[4], 0, 2, "");
//		queenComb(new boolean[4], 0, 2, "", 0);

		int[] coins = { 2, 3, 6, 4 };
//		System.out.println(coinchange(coins, 0, 10, "", 0));
//		coinChangeCoin(coins, 0, 10, "");

//		boolean[][] board = new boolean[4][4];

		int[][] arr = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 }, { 0, 1, 0, 0 } };
//		combQueenBox(board, 0, 0, 2, "");
//		combQueen2d(board, 0, 0, 0, 2, "");
//		NQueen(board, 0, 0, 0, board.length, "");
//		NQueen_Eff(board, 0, 0, 4, "");

//		blockedMaze(arr, 0, 0, "", board);

		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";

		int n = board.length;
		int m = board[0].length;
		boolean ans = false;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {

				if (board[row][col] == word.charAt(0)) {
					ans = ans || wordSearch(board, row, col, new boolean[n][m], word, 0);

				}
			}
		}

		if (ans) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static void queenPrmt(boolean[] board, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				queenPrmt(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;
			}
		}
	}

	public static void queenComb(boolean[] board, int qpsf, int tq, String ans, int Lastplaced) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = Lastplaced; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				queenComb(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
				board[i] = false;
			}
		}
	}

	public static int coinchange(int[] coins, int vidx, int target, String ans, int lastUsed) {

		if (target == 0) {
			System.out.println(ans);
			return 1;
		}

		if (target < 0) {
			return 0;
		}

		int cnt = 0;
		for (int i = lastUsed; i < coins.length; i++) {

			cnt += coinchange(coins, i, target - coins[i], ans + coins[i], i);
		}

		return cnt;
	}

	public static void combQueenBox(boolean[] board, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		board[col] = true;
		combQueenBox(board, col + 1, qpsf + 1, tq, ans + "b" + col);
		board[col] = false;

		combQueenBox(board, col + 1, qpsf, tq, ans);
	}

	public static void coinChangeCoin(int[] coins, int vidx, int target, String ans) {

		if (target == 0) {
			System.out.println(ans);
			return;
		}

		if (target < 0 || vidx == coins.length) {
			return;
		}

		coinChangeCoin(coins, vidx, target - coins[vidx], ans + coins[vidx]);
		coinChangeCoin(coins, vidx + 1, target, ans);
	}

	public static void combQueen2d(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		board[row][col] = true;
		combQueen2d(board, row, col + 1, qpsf + 1, tq, ans + "(" + row + "-" + col + ")");
		board[row][col] = false;

		combQueen2d(board, row, col + 1, qpsf, tq, ans);

	}

	public static void combQueen2dRec(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			combQueen2dRec(board, row + 1, 0, qpsf, tq, ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		board[row][col] = true;
		combQueen2dRec(board, row, col + 1, qpsf + 1, tq, ans + "(" + row + "-" + col + ")");
		board[row][col] = false;

		combQueen2dRec(board, row, col + 1, qpsf, tq, ans);

	}

	public static void NQueen(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		if (IsItSafe(board, row, col)) {
			board[row][col] = true;
			NQueen(board, row, col + 1, qpsf + 1, tq, ans + "(" + row + "-" + col + ")");
			board[row][col] = false;
		}

		NQueen(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean IsItSafe(boolean[][] board, int row, int col) {

		int r = row - 1;
		int c = col;

		// Vertical up
		while (r >= 0) {

			if (board[r][c]) {
				return false;
			}

			r--;
		}

		// Horizontal left
		r = row;
		c = col - 1;

		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}

			c--;

		}

		// Diagonal left
		r = row - 1;
		c = col - 1;

		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c--;
		}

		// Diagonal right
		r = row - 1;
		c = col + 1;

		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c++;
		}

		return true;

	}

	public static void NQueen_Eff(boolean[][] board, int row, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (IsItSafe(board, row, col)) {
				board[row][col] = true;
				NQueen_Eff(board, row + 1, qpsf + 1, tq, ans + "(" + row + "-" + col + ")");
				board[row][col] = false;
			}
		}

	}

	public static boolean blockedMaze(int[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {

			System.out.println(ans);
			return true;
		}

		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == 1
				|| visited[row][col] == true) {
			return false;
		}

		visited[row][col] = true;
		boolean down = blockedMaze(board, row + 1, col, ans + "D", visited);
		boolean up = blockedMaze(board, row - 1, col, ans + "U", visited);
		boolean left = blockedMaze(board, row, col - 1, ans + "L", visited);
		boolean right = blockedMaze(board, row, col + 1, ans + "R", visited);
		visited[row][col] = false;

		return down || up || left || right;
	}

	public static boolean IsItSafeKnight(boolean[][] board, int row, int col) {

		//
//
//		int r = row - 1;
//		int c = col - 2;
//
//		if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c]) {
//			return false;
//		}
//		r = row - 2;
//		c = col - 1;
//
//		if (board[r][c]) {
//			return false;
//		}
//		r = row - 2;
//		c = col + 1;
//
//		if (board[r][c]) {
//			return false;
//		}
//		r = row - 1;
//		c = col + 2;
//
//		if (board[r][c]) {
//			return false;
//		}

		int[][] directions = { { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 } };

		for (int[] d : directions) {

			int r = row + d[0];
			int c = col + d[1];
			if (board[r][c]) {
				return false;
			}
		}

	}

	public static boolean wordSearch(char[][] board, int row, int col, boolean[][] visited, String word, int vidx) {

		if (vidx == word.length()) {
			return true;
		}

		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col]) {
			return false;
		}

		if (board[row][col] != word.charAt(vidx)) {
			return false;
		}

		visited[row][col] = true;
		boolean down = wordSearch(board, row + 1, col, visited, word, vidx + 1);
		boolean up = wordSearch(board, row - 1, col, visited, word, vidx + 1);
		boolean left = wordSearch(board, row, col - 1, visited, word, vidx + 1);
		boolean right = wordSearch(board, row, col + 1, visited, word, vidx + 1);
//		visited[row][col] = false;

		return down || up || left || right;
	}

}
