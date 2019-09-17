package sept17;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		int sum = 0;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum += arr[j];

				if (sum > max) {
					max = sum;
				}
			}
		}

		System.out.println(max);

	}

}
