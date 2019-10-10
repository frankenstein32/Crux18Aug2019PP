package Assingments.oct10;

public class SubarrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum += arr[j];
//				for(int k = i; k <= j;k++) {
//					System.out.print(arr[k]+" ");
//				}
//				
				System.out.println(sum);
			}
		}
	}

}
