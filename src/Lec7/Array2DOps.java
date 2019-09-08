package Lec7;

import java.util.Scanner;

public class Array2DOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] arr = takeInput();
//		display(arr);

		int[][] arr = { { 1, 2, 3 }, { 6, 7, 8 }, { 11, 12, 13 }, { 16, 17, 18 }, { 21, 22, 23 }

		};

		spiral(arr);

	}

	public static int[][] takeInput() {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Rows? ");
		int rows = scn.nextInt();

		int[][] arr = new int[rows][];

		for (int r = 0; r < arr.length; r++) {

			System.out.println("Enter cols for " + r + " rows? ");
			int cols = scn.nextInt();

			// Most Important
			arr[r] = new int[cols];

			for (int c = 0; c < cols; c++) {

				System.out.println("Enter value for[ " + r + "-" + c + "]? ");
				arr[r][c] = scn.nextInt();
			}
		}

		return arr;

	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void Vertical(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {

				System.out.print(arr[row][col] + " ");
			}
		}

	}

	public static void wave(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) {

				for (int row = 0; row < arr.length; row++) {

					System.out.print(arr[row][col] + " ");
				}
			} else {

				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}

	}

	public static void spiral(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int total = arr.length * arr[0].length;
		int cnt = 0;

		while (cnt < total) {

			for (int row = minRow; row <= maxRow && cnt < total; row++) {

				System.out.print(arr[row][minCol] + " ");
				cnt++;
			}
			minCol++;

			for (int col = minCol; col <= maxCol && cnt < total; col++) {
				System.out.print(arr[maxRow][col] + " ");
				cnt++;
			}
			maxRow--;

			for (int row = maxRow; row >= minRow && cnt < total; row--) {

				System.out.print(arr[row][maxCol] + " ");
				cnt++;
			}
			maxCol--;

			for (int col = maxCol; col >= minCol && cnt < total; col--) {

				System.out.print(arr[minRow][col] + " ");
				cnt++;
			}
			minRow++;
		}

	}

}
