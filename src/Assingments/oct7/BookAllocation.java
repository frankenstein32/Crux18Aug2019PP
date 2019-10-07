package Assingments.oct7;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int nb = scn.nextInt();
			int ns = scn.nextInt();

			int[] pages = new int[nb];
			for (int i = 0; i < nb; i++) {
				pages[i] = scn.nextInt();
			}

			int lo = pages[0];
			int hi = 0;

			for (int page : pages) {
				hi += page;
			}

			hi = hi - lo;

			int ans = 0;
			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (IsItPossible(pages, mid, ns)) {

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

	private static boolean IsItPossible(int[] pages, int mid, int ns) {

		int students = 1;
		int pagesRead = 0;

		int curr_book = 0;

		while (curr_book < pages.length) {

			if (pagesRead + pages[curr_book] <= mid) {

				pagesRead = pagesRead + pages[curr_book];
				curr_book++;

			} else {
				students++;
				pagesRead = 0;

			}

			if (students > ns) {
				return false;
			}

		}

		return true;

	}

}
