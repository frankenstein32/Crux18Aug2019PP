package Lec4;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);
		
		
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();

		for (int t = min; t <= max; t = t + step) {

			int c = (int) ((5.0 / 9) * (t - 32));

			System.out.println(t + "\t" + c);

		}

	}

}
