package Assingments.Oct16;

import java.util.Scanner;

public class isBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(isB(str, new StringBuilder()));
	}

	public static boolean isB(String str, StringBuilder ans) {

		if (str.length() == 0) {
			return ans.length() == 0;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (ch == '(' || ch == '{' || ch == '[') {
			ans.append(ch);
			return isB(ros, ans);
		}

		if (ch == ')' || ch == '}' || ch == ']') {

			if (ans.length() == 0) {
				return false;
			}
			char temp = ans.charAt(ans.length() - 1);

			if (ch == '}' && temp != '{') {
				return false;
			} else if (ch == ']' && temp != '[') {
				return false;
			} else if (ch == ')' && temp != '(') {
				return false;
			}

			ans.deleteCharAt(ans.length() - 1);
			return isB(ros, ans);
		}

		return isB(ros, ans);

	}

}
