package Assingments.Nov1;

public class Ruler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		printIntervals(4);
		printRuler(1, 5);
	}

	public static void print(int n, int val) {

		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}

		if (val != -1)
			System.out.println(val);
		else {
			System.out.println();
		}
	}

	public static void printRuler(int inch, int maxL) {

		for (int i = 0; i < inch; i++) {

			print(maxL, i);
			printIntervals(maxL - 1);
		}

		print(maxL, inch);

	}

	public static void printIntervals(int n) {

		if (n == 0) {
			return;
		}

		printIntervals(n - 1);
		print(n, -1);
		printIntervals(n - 1);

	}

}
