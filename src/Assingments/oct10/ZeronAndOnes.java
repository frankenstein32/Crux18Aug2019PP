package Assingments.oct10;

import java.util.Scanner;

public class ZeronAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			int si = -1;
			int ei = -1;

			for (int i = 0; i < arr.length; i++) {

				int cnt_0 = 0;
				int cnt_1 = 0;

				for (int j = i; j < arr.length; j++) {

					if (arr[j] == 0) {
						cnt_0++;
					} else {
						cnt_1++;
					}

					if (cnt_0 == cnt_1) {

						if (ei - si + 1 < j - i + 1) {
							si = i;
							ei = j;
						}
					}
				}
			}

			if (si != -1) {
				System.out.println(si + " " + ei);
			} else {
				System.out.println("None");
			}

			t--;
		}
	}

}
