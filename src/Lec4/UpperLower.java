package Lec4;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper Case");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower Case");
		} else {
			System.out.println("Invalid");
		}
	}

}
