package Assingments.sept17;

import java.util.Arrays;
import java.util.Scanner;

public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {

				int sum = arr[i] + arr[j] + arr[k];

				if (sum < target) {

					j++;
				} else if (sum > target) {
					k--;
				} else {

					System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);

					j++;
					k--;
				}
			}

		}

	}

}
