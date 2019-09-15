package Lec7;

import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

//		Substrings(str);
		System.out.println(CountSubstrings(str));
	}

	public static boolean isPal(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;

	}

	public static void Substrings(String str) {

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				System.out.println(str.substring(i, j));
			}
		}

	}

	public static int CountSubstrings(String str) {

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				if (isPal(str.substring(i, j))) {
					cnt++;
					System.out.println(str.substring(i, j));
				}

			}
		}

		return cnt;

	}

}
