package Lec5;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int item = 60;
		System.out.println(search(arr, item));
	}

	public static int search(int[] arr, int item) {

		int lo = 0, hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item < arr[mid]) {

				hi = mid - 1;
			} else if (item > arr[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
