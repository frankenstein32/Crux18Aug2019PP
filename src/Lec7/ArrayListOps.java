package Lec7;

import java.util.ArrayList;

public class ArrayListOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] one = { 1, 4, 4, 5, 5 };
		int[] two = { 0, 4, 4, 6, 7 };

		System.out.println(intersection(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		int i = 0, j = 0;
		ArrayList<Integer> list = new ArrayList<>();

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {

				list.add(one[i]);
				i++;
				j++;
			}

		}

		return list;

	}

	public static ArrayList<Integer> sumOfTwoNos(int[] one, int[] two) {

		int i = one.length - 1;
		int j = two.length - 1;

		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum = sum + one[i];
			}

			if (j >= 0) {
				sum = sum + two[j];
			}

			int rem = sum % 10;
			carry = sum / 10;

			list.add(0, rem);

			i--;
			j--;

		}

		if (carry > 0) {
			list.add(0, carry);
		}

		return list;

	}
}
