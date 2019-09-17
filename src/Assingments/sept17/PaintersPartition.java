package Assingments.sept17;

import java.util.Scanner;

public class PaintersPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int nob = scn.nextInt();
		int nop = scn.nextInt();

		int[] boards = new int[nob];

		for (int i = 0; i < nob; i++) {
			boards[i] = scn.nextInt();
		}

		int lo = 0;
		int hi = 0;

		for (int board : boards) {
			hi += board;
		}
		System.out.println(hi);

		int ans = 0;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(boards, nop, mid)) {

				ans = mid;
				hi = mid - 1;
			} else {

				lo = mid + 1;
			}

		}
		System.out.println(ans);

	}

	public static boolean isItPossible(int[] boards, int nop, int mid) {

		int painters = 1;
		int timeElapsed = 0;
		int curr_board = 0;
		while (curr_board < boards.length) {
			if (timeElapsed + boards[curr_board] <= mid) {
				timeElapsed += boards[curr_board];

				curr_board++;
			} else {
				painters++;
				timeElapsed = 0;
				if (painters > nop) {
					return false;
				}
			}
		}
		return true;
	}

}
