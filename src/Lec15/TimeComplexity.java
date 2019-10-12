package Lec15;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(count_Pal("nitin"));

	}

	public static int power(int x, int n) {

		int mult = x;
		int sum = 0;
		for (int i = n; i >= 1; i--) {

			sum = sum + i * mult;
			mult = mult * x;

		}

		return sum;

	}

	public static int power2(int x, int n) {
		int power = (int) Math.pow(x, n);
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum = sum + i * power;
			power = power / x;
		}

		return sum;
	}

	public static int count_Pal(String str) {

		int res = 0;
		for (int i = 0; i < str.length(); i++) {

			int center1 = grow(str, i, i);
			int center2 = grow(str, i, i + 1);

			res += center1 + center2;
		}

		return res;

	}

	public static int grow(String str, int si, int ei) {

		int cnt = 0;

		while (si >= 0 && ei < str.length() && str.charAt(si) == str.charAt(ei)) {
			cnt++;
			si--;
			ei++;
		}

		return cnt;

	}

}
