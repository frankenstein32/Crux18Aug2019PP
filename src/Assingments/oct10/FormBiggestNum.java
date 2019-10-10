package Assingments.oct10;

import java.util.Scanner;

public class FormBiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			sort(arr);

			for (int val : arr)
				System.out.print(val);

			System.out.println();

			t--;
		}
	}

	public static void sort(int[] arr) {

		for (int i = 0; i <= arr.length - 2; i++) {

			for (int j = 0; j <= arr.length - 2 - i; j++) {

				if (compare(arr[j], arr[j + 1]) == false) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static boolean compare(int num1, int num2) {

		String s1 = "" + num1 + num2;
		String s2 = "" + num2 + num1;

		int ans = s1.compareTo(s2);

		if (ans < 0) {
			return false;
		} else {
			return true;
		}

	}

}
