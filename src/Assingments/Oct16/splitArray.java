package Assingments.Oct16;

import java.util.Scanner;

public class splitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		int cnt = split(arr, 0, 0, "", 0, "");
		System.out.println(cnt);
	}

	public static int split(int[] arr, int vidx, int sum1, String ans1, int sum2, String ans2) {

		if (vidx == arr.length) {

			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);

				return 1;
			}

			return 0;
		}

		int cnt = 0;
		cnt += split(arr, vidx + 1, sum1 + arr[vidx], ans1 + arr[vidx] + " ", sum2, ans2);
		cnt += split(arr, vidx + 1, sum1, ans1, sum2 + arr[vidx], ans2 + arr[vidx] + " ");

		return cnt;
	}

}
