package Lec13;


public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10000;
		int a = 2;
		int b = 1;
		
		
		for(int i = 0;i < n;i++) {
			System.out.println("H");
		}
		
		for(int i = 0;i < n;i++) {
			System.out.println("E");
		}
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		
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
