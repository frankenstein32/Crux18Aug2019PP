package Assingments.oct10;

import java.util.Scanner;

public class FormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			String str = scn.next();
			int[] arr = new int[str.length() + 1];

			int cnt = 1;
			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {
					arr[i] = cnt++;

					for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
						arr[j] = cnt++;
					}
				}
			}

			for (int val : arr) {
				System.out.print(val);
			}

			System.out.println();
			t--;
		}

	}

}
