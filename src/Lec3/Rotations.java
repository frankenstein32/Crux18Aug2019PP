package Lec3;

import java.util.Scanner;

public class Rotations {

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

		int ans = temp;

//		System.out.println(rot);
		for (int r = 1; r <= rot; r++) {

			int rem = temp % 10;
			temp = temp / 10;

			ans = rem * (int) Math.pow(10, cnt - 1) + temp;
			temp = ans;

		}

		System.out.println(ans);

	}

}
