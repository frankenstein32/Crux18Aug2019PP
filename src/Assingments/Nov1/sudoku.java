package BackTracking;

import java.util.Scanner;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scn.nextInt();
			}
		}

		solver(board, 0, 0);

	}

	public static void solver(int[][] board, int row, int col) {

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			display(board);
			return;
		}

		if (board[row][col] != 0) {
			solver(board, row, col + 1);
			return;
		}

		for (int d = 1; d <= 9; d++) {

			if (isItSafe(board, row, col, d)) {
				board[row][col] = d;
				solver(board, row, col + 1);
				board[row][col] = 0;
			}
		}

	}

	public static boolean isItSafe(int[][] board, int row, int col, int val) {

		// check row
		for (int c = 0; c < 9; c++) {

			if (board[row][c] == val) {
				return false;
			}
		}

		// check col
		for (int r = 0; r < 9; r++) {

			if (board[r][col] == val) {
				return false;
			}
		}

		// check block

		int si = row - row % 3;
		int ei = col - col % 3;

		for (int i = si; i < si + 3; i++) {
			for (int j = ei; j < ei + 3; j++) {

				if (board[i][j] == val) {
					return false;
				}
			}
		}

		return true;

	}

	public static void display(int[][] arr) {

		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

	}

}
