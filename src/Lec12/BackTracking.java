package Lec12;

public class BackTracking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		queenPrmt(new boolean[4], 0, 2, "");
		queenComb(new boolean[4], 0, 2, "", 0);

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

}
