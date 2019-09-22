package Lec9;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RecursionGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(keyPad("145"));
//		System.out.println(permutation("abc"));
//		System.out.println(boardPath(0, 10));
//		System.out.println(mazePath(0, 0, 2, 2).size());
//		System.out.println(mazePathMM(0, 0, 2, 2));
		System.out.println(mazePathMM(0, 0, 3, 3));
		System.out.println(coinToss(3));

	}

	public static ArrayList<String> subseq(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = subseq(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			mr.add(val);
			mr.add(ch + val);
		}

		return mr;

	}

	public static ArrayList<String> subseqASCII(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = subseqASCII(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			mr.add(val);
			mr.add(ch + val);
			mr.add((int) ch + val);
		}

		return mr;

	}

	public static ArrayList<String> keyPad(String str) {

		if (str.length() == 0) {

			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = keyPad(ros);

		String code = getCode(ch);

		ArrayList<String> mr = new ArrayList<>();

		for (int i = 0; i < code.length(); i++) {

			char temp = code.charAt(i);

			for (String val : rr) {

				mr.add(temp + val);
			}

		}

		return mr;

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> permutation(String str) {

		if (str.length() == 0) {

			ArrayList<String> br = new ArrayList<>();
			br.add("");

			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = permutation(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			for (int i = 0; i <= val.length(); i++) {

				String temp = val.substring(0, i) + ch + val.substring(i);
				mr.add(temp);
			}

		}

		return mr;

	}

	public static ArrayList<String> boardPath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;

		}
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			ArrayList<String> rr1 = boardPath(curr + dice, end);

			for (String val : rr1) {
				mr.add(dice + val);
			}

		}

		return mr;

	}

	public static ArrayList<String> mazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {

			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		if (cc + 1 <= ec) {
			ArrayList<String> rrH = mazePath(cr, cc + 1, er, ec);

			for (String val : rrH) {

				mr.add("H" + val);
			}

		}

		if (cr + 1 <= er) {
			ArrayList<String> rrV = mazePath(cr + 1, cc, er, ec);

			for (String val : rrV) {

				mr.add("V" + val);
			}
		}

		return mr;
	}

	public static ArrayList<String> mazePathMM(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();

			return br;

		}

		ArrayList<String> mr = new ArrayList<>();

		for (int m = 1; m <= ec; m++) {
			ArrayList<String> rrH = mazePathMM(cr, cc + m, er, ec);

			for (String val : rrH) {

				mr.add("H" + m + val);
			}
		}

		for (int m = 1; m <= er; m++) {
			ArrayList<String> rrV = mazePathMM(cr + m, cc, er, ec);

			for (String val : rrV) {

				mr.add("V" + m + val);
			}
		}

		for (int m = 1; m <= er && m <= ec; m++) {
			ArrayList<String> rrD = mazePathMM(cr + m, cc + m, er, ec);

			for (String val : rrD) {

				mr.add("D" + m + val);
			}
		}

		return mr;
	}

	public static ArrayList<String> coinToss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rr = coinToss(n - 1);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);

		}

		return mr;

	}

}
