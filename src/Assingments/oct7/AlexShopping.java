package Assingments.oct7;

import java.util.Scanner;

public class AlexShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] item = new int[n];
		for (int i = 0; i < n; i++) {
			item[i] = scn.nextInt();
		}

		int q = scn.nextInt();

		while (q > 0) {

			int money = scn.nextInt();
			int k = scn.nextInt();
			int cnt = 0;
			for (int i = 0; i < item.length; i++) {

				if (money % item[i] == 0) {
					cnt++;
				}
			}

			if (cnt < k) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

			q--;
		}

	}

}
