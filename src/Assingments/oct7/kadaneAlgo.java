package Assingments.oct7;

public class kadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -2, -3, 4, -5, 9, -8, 4, 3 };

		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			curr_sum += arr[i];
			max_sum = Math.max(max_sum, curr_sum);

			if (curr_sum < 0) {
				curr_sum = 0;

			}

		}

		System.out.println(max_sum);
	}

}
