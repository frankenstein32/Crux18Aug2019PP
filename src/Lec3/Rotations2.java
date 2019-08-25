package Lec3;

import java.util.Scanner;

public class Rotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter n? ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();

		int temp = n;
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n / 10;
		}

		rot = rot % cnt;

		if (rot < 0) {
			rot += cnt;
		}

		int divisor = (int) Math.pow(10, rot);
		int rem = temp % divisor;
		temp = temp / divisor;

		int mult = (int) Math.pow(10, cnt - rot);

		int ans = rem * mult + temp;

		System.out.println(ans);

	}

}
