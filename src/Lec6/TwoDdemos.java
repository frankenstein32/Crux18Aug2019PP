package Lec6;

import java.util.Scanner;

public class TwoDdemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[3][2];

		System.out.println(arr[0]);
		// Accessing
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[1][0] = 3;
//		arr[1][1] = 4;
//		arr[2][0] = 5;
//		arr[2][1] = 6;

		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = scn.nextInt();

			}

		}
//
//		System.out.println(arr[0][0] + " " + arr[0][1]);
//		System.out.println(arr[1][0] + " " + arr[1][1]);
//		System.out.println(arr[2][0] + " " + arr[2][1]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		arr[0][1] = arr[1][0];

		// jagged

	}

}
