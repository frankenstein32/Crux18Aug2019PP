package Assingments.Oct16;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			System.out.println(maxScore(arr, 0, arr.length - 1));
		}

	}

	public static int maxScore(int[] arr, int si, int ei) {

		int max = 0;
		for (int i = si; i < ei; i++) {

			if (sum(arr, si, i) == sum(arr, i + 1, ei)) {
				int fh = maxScore(arr, si, i);
				int sh = maxScore(arr, i + 1, ei);

				return Math.max(fh, sh) + 1;
			}
		}

		return 0;
	}

	public static int sum(int[] arr, int si, int ei) {

		int s = 0;
		for (int i = si; i <= ei; i++) {
			s += arr[i];
		}

		return s;
	}

}
