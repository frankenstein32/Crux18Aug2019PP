package Assingments.oct10;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			System.out.println(maxSum(arr));
			t--;
		}
	}

	public static int maxSum(int[] arr) {

		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];

		leftMax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
		}

		rightMax[rightMax.length - 1] = arr[arr.length - 1];
		for (int i = rightMax.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
		}

		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			res += Math.min(leftMax[i], rightMax[i]) - arr[i];
		}

		return res;

	}

}
