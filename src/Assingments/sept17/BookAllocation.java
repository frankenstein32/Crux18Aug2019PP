package Assingments.sept17;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {

			int nob = scn.nextInt();
			int nos = scn.nextInt();

			int[] books = new int[nob];

			for (int i = 0; i < nob; i++) {
				books[i] = scn.nextInt();
			}

			int lo = books[0];
			int hi = 0;

			for (int pages : books) {
				hi += pages;
			}

			hi = hi - lo;

			int ans = 0;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(books, nos, mid)) {

					ans = mid;
					hi = mid - 1;
				} else {

					lo = mid + 1;
				}

			}
			System.out.println(ans);

			t--;
		}

	}

	public static boolean isItPossible(int[] books, int nos, int mid) {

		int students = 1;
		int pages_read = 0;
		int curr_book = 0;
		while (curr_book < books.length) {
			if (pages_read + books[curr_book] <= mid) {
				pages_read += books[curr_book];

				curr_book++;
			} else {
				students++;
				pages_read = 0;
				if (students > nos) {
					return false;
				}
			}
		}
		return true;
	}

}
