package Assingments.sept17;

import java.util.Scanner;

public class HelppRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int nor = scn.nextInt();
			int noc = scn.nextInt();

			int[] rick = new int[nor];
			int[] cabs = new int[noc];

			for (int i = 0; i < nor; i++) {
				rick[i] = scn.nextInt();
			}

			for (int i = 0; i < noc; i++) {
				cabs[i] = scn.nextInt();
			}

			System.out.println(minFare(cabs, rick, c1, c2, c3, c4));
//			t--;
		}

	}

	public static int minFare(int[] cabs, int[] rick, int c1, int c2, int c3, int c4) {

		int rick_fare = minFare1(rick, c1, c2, c3);
		int cabs_fare = minFare1(cabs, c1, c2, c3);

		return Math.min(rick_fare + cabs_fare, c4);
	}

	public static int minFare1(int[] arr, int c1, int c2, int c3) {

		int fare = 0;

		for (int i = 0; i < arr.length; i++) {

			fare += Math.min(c1 * arr[i], c2);
		}

		return Math.min(fare, c3);

	}

}
