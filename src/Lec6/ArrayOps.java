package Lec6;

import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//		System.out.println(arr);

		reverse(arr);
//		rotate(arr, 3);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void reverse(int[] arr) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo < hi) {

			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;

			lo++;
			hi--;

		}
	}

	public static void reverse(int[] arr, int i, int j) {

		int lo = i;
		int hi = j;

		while (lo < hi) {

			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;

			lo++;
			hi--;

		}
	}

	public static void rotate2(int[] arr, int r) {

		r = r % arr.length;

		if (r < 0) {
			r += arr.length;
		}

		int length = arr.length;
		int i = arr.length - r;

		reverse(arr, 0, i - 1);
		reverse(arr, i, length - 1);
		reverse(arr, 0, length - 1);

	}

	public static void rotate(int[] arr, int r) {

		r = r % arr.length;

		if (r < 0) {
			r += arr.length;
		}
		for (int i = 0; i < r; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {

				arr[j] = arr[j - 1];

			}

			arr[0] = temp;
		}

	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int newIndex = arr[i];
			int newValue = i;

			res[newIndex] = newValue;

//			res[arr[i]] = i; // Alternate Method	 		
		}

		return res;
	}

}
