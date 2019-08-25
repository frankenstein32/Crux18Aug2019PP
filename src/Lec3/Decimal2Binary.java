package Lec3;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 63;
		int mult = 1;
		int ans = 0;

		while (n > 0) {

			int rem = n % 2;
			ans = ans + rem * mult;
			mult = mult * 10;

			n = n / 2;
		}

		System.out.println(ans);

	}

}
