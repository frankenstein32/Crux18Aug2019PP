package Assingments.sept17;

import java.util.*;

public class CircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			System.out.println(maxSum(arr));
		}
	}

	public static int maxSum(int[] arr) {

		int normal_sum = kadane(arr);
		int tot_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			tot_sum += arr[i];
			arr[i] = -arr[i];
		}
		int non_wrap = kadane(arr);
		tot_sum = tot_sum + non_wrap;
		return Math.max(normal_sum, tot_sum);

	}

	public static int kadane(int[] arr) {

		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			curr_sum += arr[i];

			max_sum = Math.max(max_sum, curr_sum);
			if (curr_sum < 0) {
				curr_sum = 0;
			}

		}

		return max_sum;

	}

}
