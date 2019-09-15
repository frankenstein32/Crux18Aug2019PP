package Lec5;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 4, 3, 2, 1 };
		sort(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void sort(int[] arr) {

		for (int i = 0; i <= arr.length - 2; i++) {

			for (int j = 0; j <= arr.length - 2 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}
