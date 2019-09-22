package Lec11;

public class RecursionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		subseq("abc", "");
		prmt("amr", "");
	}

	public static void subseq(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		subseq(ros, ans);
		subseq(ros, ans + ch);

	}

	public static void kpc(String ques, String ans) {

		if (ques.length() == 0) {

			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {

			kpc(ros, ans + code.charAt(i));
		}

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

	public static void prmt(String ques, String ans) {

		if (ques.length() == 0) {

			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			prmt(ros, ans + ch);
		}

	}

}
