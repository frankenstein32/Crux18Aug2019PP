package Lec1;

public class primeRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 27;

		int fact = 0;

		int i = 1;
		while (i <= n) {

			if (n % i == 0) {
				fact++;
			}
			i++;

		}

		if (fact == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
