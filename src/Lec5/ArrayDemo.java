package Lec5;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr;
		// System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);

		System.out.println(arr.length);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set : constant time
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// arr[5] = 60 ;

		// get : constant time
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// loop
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
			// arr[i] = 100 ;
		}

		for (int i = arr.length - 1; i >= 0; i--) {

		}
		// enhanced for loop
		// 1. read only
		// 2. forward only
		System.out.println("-- EFL --");
		for (int val : arr) {
			System.out.println(val);
			val = 100;
			System.out.println(val);
		}

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		int[] arr1 = arr;

		int[] arr2 = new int[3];
		arr1 = arr2;

		int i = 0, j = 2;

		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		System.out.println(arr[i] + ", " + arr[j]);
		// Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}

	public static void Swap(int[] one, int[] two) {
		int temp = one[0];
		one[0] = two[0];
		two[0] = temp;
	}

	public static void Swap(int[] a, int i, int j) {
		System.out.println(a[i] + ", " + a[j]);

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

		System.out.println(a[i] + ", " + a[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}