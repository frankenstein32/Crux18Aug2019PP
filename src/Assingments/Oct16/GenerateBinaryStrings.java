package Assingments.Oct16;

import java.util.Scanner;

public class GenerateBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			String str = scn.next();
			print(str, "");

			System.out.println();
		}
	}

	public static void print(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch == '?') {
			print(ros, ans + "0");
			print(ros, ans + "1");
		} else {
			print(ros, ans + ch);
		}

	}

}
