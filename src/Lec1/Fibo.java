package Lec1;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int counter = 0;

		int a = 0;
		int b = 1;

		int sum = 0;
		while (counter <= n) {

			sum = a + b;
			System.out.print(a + " ");
			// shifting
			a = b;
			b = sum;

			counter++;

		}

	}

}
