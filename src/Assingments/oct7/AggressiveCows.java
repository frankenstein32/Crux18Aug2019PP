package Assingments.oct7;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int ns = scn.nextInt();
		int nc = scn.nextInt();

		int[] stalls = new int[ns];
		for (int i = 0; i < ns; i++) {
			stalls[i] = scn.nextInt();
		}

		// Algo
		Arrays.sort(stalls);

		int lo = 0;
		int hi = stalls[ns - 1] - stalls[0];
//		int hi = Integer.MAX_VALUE;

		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (IsItPossible(stalls, mid, nc)) {

				ans = mid;
				lo = mid + 1;

			} else {
				hi = mid - 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean IsItPossible(int[] stalls, int mid, int nc) {

		int cowsPlaced = 1;
		int lastPlaced = stalls[0];

		for (int i = 1; i < stalls.length; i++) {

			if (stalls[i] - lastPlaced >= mid) {
				cowsPlaced++;
				lastPlaced = stalls[i];
			}

			if (cowsPlaced == nc) {
				return true;
			}

		}

		return false;
	}

}
