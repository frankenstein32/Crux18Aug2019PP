package Assingments.oct7;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4 };

		int max = Integer.MIN_VALUE;

		int si = -1;
		int ei = -1;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum += arr[j];
//				max = Math.max(max, sum);
//				System.out.println();

				if (sum > max) {

					max = sum;
					si = i;
					ei = j;
				}
			}
		}

		System.out.println(max);

	}

}
