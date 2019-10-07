package Assingments.oct7;

import java.util.Scanner;

public class PaintersPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int np = scn.nextInt();
		int nb = scn.nextInt();

		int[] board = new int[nb];
		for (int i = 0; i < nb; i++) {
			board[i] = scn.nextInt();
		}

		int lo = board[0];
		int hi = 0;

		for (int page : board) {
			hi += page;
		}

		hi = hi - lo;

		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (IsItPossible(board, mid, np)) {

				ans = mid;
				hi = mid - 1;
			} else {

				lo = mid + 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean IsItPossible(int[] board, int mid, int np) {

		int painters = 1;
		int timeElapsed = 0;

		int curr_board = 0;

		while (curr_board < board.length) {

			if (timeElapsed + board[curr_board] <= mid) {

				timeElapsed = timeElapsed + board[curr_board];
				curr_board++;

			} else {
				painters++;
				timeElapsed = 0;

			}

			if (painters > np) {
				return false;
			}

		}

		return true;

	}

	
}
