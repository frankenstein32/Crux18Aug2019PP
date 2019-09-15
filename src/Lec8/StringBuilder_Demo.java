package Lec8;

import java.util.Scanner;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		StringBuilder sb = new StringBuilder(str);

		// String -> StringBuilder

		// StringBuilder -> String

		String str2 = sb.toString();

		System.out.println(sb.length());
		System.out.println(sb.charAt(3));

		// set
//		sb.setCharAt(0, 'p');
		System.out.println(sb);

//		sb.append("abc");
		System.out.println(sb);

		sb.insert(1, 'h');

		System.out.println(sb);

//		sb.deleteCharAt(1);
		System.out.println(sb);

//		sb.deleteCharAt(2);
		System.out.println(sb);

		sb.delete(1, 5);
		System.out.println(sb);

		long start = System.currentTimeMillis();
		appendString();
		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

	public static void appendString() {

		int n = 1_000_00;
		String str = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			str += i;
//			sb.append(i);
		}

	}

	public static String toggleCase(String str) {

		StringBuilder sb = new StringBuilder(str);
//		char temp = 'a';
		for (int i = 0; i < sb.length(); i++) {

			char ch = sb.charAt(i);

			if (Character.isUpperCase(ch)) {

				ch = Character.toLowerCase(ch);
				sb.setCharAt(i, ch);

			} else if (Character.isLowerCase(ch)) {

				ch = Character.toUpperCase(ch);
				sb.setCharAt(i, ch);

			}

		}

		return sb.toString();

	}

}
