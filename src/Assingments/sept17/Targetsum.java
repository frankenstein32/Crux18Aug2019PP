package sept17;

import java.util.Arrays;
import java.util.Scanner;

public class Targetsum {

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

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int sum = arr[i] + arr[j];

			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {

				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}

		}

	}

}
