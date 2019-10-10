package Assingments.oct10;

import java.util.Scanner;

public class maxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();

			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];

			for (int i = 0; i < n1; i++) {
				arr1[i] = scn.nextInt();
			}

			for (int i = 0; i < n2; i++) {
				arr2[i] = scn.nextInt();
			}

			System.out.println(maxSum(arr1, arr2));

			t--;
		}
	}

	public static int maxSum(int[] one, int[] two) {

		int res = 0;
		int s1 = 0, s2 = 0;
		int i = 0, j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				s1 += one[i];
				i++;
			} else if (one[i] > two[j]) {
				s2 += two[j];
				j++;
			} else {
				res += Math.max(s1, s2) + one[i];
				s1 = 0;
				s2 = 0;
				i++;
				j++;
			}
		}

		while (i < one.length) {
			s1 += one[i];
			i++;
		}

		while (j < two.length) {
			s2 += two[j];
			j++;
		}

		res += Math.max(s1, s2);

		return res;
	}

}
