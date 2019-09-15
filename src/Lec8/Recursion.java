package Lec8;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PD(5);
//		PI(1);
//		int fact = fact(5);
//		System.out.println(fact);\

//		System.out.println(power(2, 3));
//		System.out.println(fibonacci(6));

		int[] arr = { 1, 2, 3, 4, 5 };
		printArray(arr, 0);
	}

	public static int PD(int n) {

		if (n == 0) {
			return 0;
		}

		System.out.println(n);
		int temp = PD(n - 1);
		System.out.println(temp);

		return n;

	}

	public static void PI(int n) {

		if (n == 6) {
			return;
		}
		System.out.println(n);
		PI(n + 1);

	}

	public static int fact(int n) {

		if (n == 1) {

			return 1;
		}

		int temp = fact(n - 1);
		temp = temp * n;

		return temp;

	}

	public static int power(int a, int b) {
		if (b == 0) {

			return 1;
		}

		int temp = power(a, b - 1);
		temp = temp * a;

		return temp;

	}

	public static int fibonacci(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		int fib1 = fibonacci(n - 1);
		int fib2 = fibonacci(n - 2);

		return fib1 + fib2;

	}

	public static void printArray(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);
		printArray(arr, vidx + 1);

	}

	public static int findMax(int[] arr, int vidx) {

		if (vidx == arr.length) {

			return Integer.MIN_VALUE;
//			return arr[vidx];
		}

		int rr = findMax(arr, vidx + 1);

		return Math.max(arr[vidx], rr);
//		if(arr[vidx] > rr) {
//			return arr[vidx];
//		}
//		
//		return rr;

	}

	public static int firstIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == item) {
			return vidx;
		}

		int rr = firstIndex(arr, vidx + 1, item);

		return rr;

	}

	public static int LastIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int rr = LastIndex(arr, vidx + 1, item);

		if (rr == -1 && arr[vidx] == item) {
			return vidx;
		}

		return rr;

	}

	public static int[] AllIndices(int[] arr, int vidx, int item) {

	}

}
