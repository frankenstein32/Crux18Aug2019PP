package Assingments.sept17;

import java.util.Scanner;

public class Alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int q = scn.nextInt();

		while (q-- > 0) {

			int money = scn.nextInt();
			int k = scn.nextInt();

			int item_purchased = 0;
			for (int i = 0; i < arr.length; i++) {

				if (money % arr[i] == 0) {
					item_purchased++;
				}
			}

			if (item_purchased >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}

}
