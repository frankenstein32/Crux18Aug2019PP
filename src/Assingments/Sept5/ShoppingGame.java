package Assingments.Sept5;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {

			int AyushLimit = scn.nextInt();
			int HarshitLimit = scn.nextInt();

			int AyushPhones = 0;
			int HarshitPhones = 0;
			int cnt = 1;

			while (true) {

				AyushPhones += cnt;
				cnt++;
				HarshitPhones += cnt;
				cnt++;

				if (AyushPhones > AyushLimit) {
					System.out.println("Harshit");
					break;
				} else if (HarshitPhones > HarshitLimit) {
					System.out.println("Aayush");
					break;
				}

			}

			t--;
		}
	}

}
