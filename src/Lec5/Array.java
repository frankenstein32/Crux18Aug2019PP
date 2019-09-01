package Lec5;

import java.util.Scanner;

public class Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Size? ");
		int n = scn.nextInt();

		int[] ans = takeInput(n);

		display(ans);
	}

	public static int[] takeInput(int n) {

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
