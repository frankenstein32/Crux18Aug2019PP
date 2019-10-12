package Lec5;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 5, 1, 3, 0, 2, 34 };
		sort(arr);
//		System.out.println(arr);

//		for(int val : arr) {
//			System.out.print(val+" ");
//		}

		sort(new int[] { 1, 2, 5, 1, 3, 0, 2, 34 });

	}

	public static void sort(int[] arr) {

		for (int cnt = 0; cnt <= arr.length - 2; cnt++) {

			int min = cnt;

			for (int j = cnt + 1; j <= arr.length - 1; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[cnt];
			arr[cnt] = arr[min];
			arr[min] = temp;

		}
	}

}
