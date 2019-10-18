package Assingments.Oct16;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		int target = scn.nextInt();
		int cnt = calculate(arr, 0, "", target);
		System.out.println();
		System.out.println(cnt);
	}

	public static int calculate(int[] arr, int vidx, String ans, int target) {

		if (vidx == arr.length) {

			if (target == 0) {
				System.out.print(ans + " ");
				return 1;
			}

			return 0;
		}

		int cnt = 0;
		cnt += calculate(arr, vidx + 1, ans + arr[vidx] + " ", target - arr[vidx]);
		cnt += calculate(arr, vidx + 1, ans, target);

		return cnt;
	}

}
