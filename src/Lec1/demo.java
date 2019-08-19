package Lec1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		scn.close();
		System.out.println("The num is " + n);

		System.out.println(5 % 2);

		int x = 2;
		int y = 3;

		System.out.println(x + y);

		int rno = 11;
		int fees = 10000;

		if (rno > 21 && rno > 10) {
			System.out.println("Hello");
		} else if (fees > 100 || fees < 400) {
			System.out.println("Nice Fees");
		}

		if (rno > 10) {
			System.out.println("Bye");
		} else {
			System.out.println("Hii Bye");
		}

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		// While

		int i = 1; // declaration
		while (i <= 5) { // condition
			System.out.println("Hello World");

			i++; // updation
		}

		// for
		for (int j = 1; j <= 5; j++) {
			System.out.println("Hello World");
		}

	}

}
