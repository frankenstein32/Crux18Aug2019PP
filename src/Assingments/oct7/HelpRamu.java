package Assingments.oct7;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int nr = scn.nextInt();
			int nc = scn.nextInt();

			int[] rick = new int[nr];
			int[] cabs = new int[nc];

			for (int i = 0; i < nr; i++) {
				rick[i] = scn.nextInt();
			}

			for (int i = 0; i < nc; i++) {
				cabs[i] = scn.nextInt();
			}

			int rick_cost = calculateFare(rick, c1, c2, c3);
			int cabs_cost = calculateFare(cabs, c1, c2, c3);

			System.out.println(Math.min(rick_cost + cabs_cost, c4));
			t--;
		}
	}

	public static int calculateFare(int[] arr, int c1, int c2, int c3) {

		int fare = 0;

		for (int i = 0; i < arr.length; i++) {

			fare += Math.min(c1 * arr[i], c2);
		}

		return Math.min(fare, c3);

	}

}
