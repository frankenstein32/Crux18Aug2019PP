package Assingments.Nov1;

public class LetterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPrmt("a1B2", "");
	}

	public static void printPrmt(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {

			printPrmt(ros, ans + Character.toLowerCase(ch));
			printPrmt(ros, ans + Character.toUpperCase(ch));
		} else {
			printPrmt(ros, ans + ch);
		}
	}
}
