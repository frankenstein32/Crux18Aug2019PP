package Assingments.Oct16;

import java.util.Scanner;

public class Kswaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();

		char[] charray = str.toCharArray();
		System.out.println(AtMostSwaps(charray, 0, k));

	}

	public static int AtMostSwaps(char[] charray, int vidx, int k) {

		int max = Integer.parseInt(new String(charray));

		if (k == 0) {
			return max;
		}

		for (int i = vidx; i < charray.length; i++) {
			for (int j = i + 1; j < charray.length; j++) {

				if (charray[j] > charray[i]) {

					swap(charray, i, j);
					int rr = AtMostSwaps(charray, vidx + 1, k - 1);
					max = Math.max(max, rr);
					swap(charray, i, j);
				}
			}
		}

		return max;

	}

	public static void swap(char[] charray, int i, int j) {

		char temp = charray[i];
		charray[i] = charray[j];
		charray[j] = temp;

	}

}
