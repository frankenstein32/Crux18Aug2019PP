package Assingments.Oct16;

import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		generate(n, 0, 0, "");
	}

	public static void generate(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		generate(n, open, close + 1, ans + ")");
		generate(n, open + 1, close, ans + "(");

	}
	
	
	
	
	

}
