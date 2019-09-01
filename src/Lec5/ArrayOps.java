package Lec5;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 6, 2, 1, 7, 3, 9 };

		int item = 2;

		System.out.println(linearSearch(arr, item));

	}

	public static int max(int[] arr) {

//		int m = arr[0];
		int m = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > m) {
				m = arr[i];
			}
		}

		return m;

	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}
}
