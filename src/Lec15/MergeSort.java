package Lec15;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 8, 1, 3, 1 };
		int[] res = mergesort(arr, 0, arr.length - 1);

		for (int val : res) {
			System.out.println(val);
		}

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {

		if (lo == hi) {

			int[] br = new int[1];
			br[0] = arr[lo];

			return br;
		}
		int mid = (hi + lo) / 2;

		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);

		int[] sorted = mergeTwoSortedArrays(fh, sh);

		return sorted;

	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] sorted = new int[one.length + two.length];

		int k = 0, i = 0, j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {

				sorted[k] = one[i];
				k++;
				i++;
			} else {

				sorted[k] = two[j];
				k++;
				j++;
			}
		}

		while (i < one.length) {
			sorted[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			sorted[k] = two[j];
			k++;
			j++;
		}

		return sorted;

	}

}
