package Assingments.Oct16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		System.out.println(generate(str));
	}

	public static ArrayList<String> generate(String str) {

		if (str.length() == 0) {

			ArrayList<String> br = new ArrayList<String>();
			br.add("");

//			ArrayList<String> br = new
//			ArrayList<String>(Arrays.asList(""));

			return br;

		}

		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);

		ArrayList<String> rr1 = generate(ros1);

		ArrayList<String> mr = new ArrayList<String>();

		int num1 = Integer.parseInt(ch1);
		char temp = (char) ('a' + num1 - 1);

		for (String val : rr1) {
			mr.add(temp + val);
		}

		if (str.length() >= 2) {

			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);

			int num2 = Integer.parseInt(ch2);

			if (num2 <= 26) {
				temp = (char) ('a' + num2 - 1);

				ArrayList<String> rr2 = generate(ros2);

				for (String val : rr2) {
					mr.add(temp + val);
				}
			}

		}

		return mr;

	}

}
