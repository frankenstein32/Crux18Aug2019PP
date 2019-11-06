package Lec27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.management.MXBean;

public class HashMap_Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "wbcdaaccaa";
		System.out.println(maxFreq(str));

		int[] arr1 = { 10, 1, 5, 1, 20, 10 };
		int[] arr2 = { 5, 20, 5, 10, 10, 25 };

		System.out.println(intersect(arr1, arr2));

	}

	public static char maxFreq(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

//			if (map.containsKey(ch)) {
//				int of = map.get(ch);
//				map.put(ch, of + 1);
//			} else {
//
//				map.put(ch, 1);
//			}

			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		int max = Integer.MIN_VALUE;
		char ch = ' ';

		Set<Character> keys = map.keySet();

		for (char key : keys) {

			if (map.get(key) > max) {
				max = map.get(key);
				ch = key;
			}

		}

		return ch;
	}

	public static ArrayList<Integer> intersect(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {

				int of = map.get(arr1[i]);
				map.put(arr1[i], of + 1);
			} else {
				map.put(arr1[i], 1);
			}

//			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		}

		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr2.length; i++) {

			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {

				ans.add(arr2[i]);

				int of = map.get(arr2[i]);
				map.put(arr2[i], of - 1);

			}
		}

		return ans;

	}

	public static void longestConseqSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}
		}

		int maxL = 0;
		int start = Integer.MIN_VALUE;

		for (int key : map.keySet()) {

			if (map.get(key)) {

				int cnt = 1;
				while (map.containsKey(key + cnt)) {
					cnt++;
				}

				if (cnt > maxL) {
					maxL = cnt;
					start = key;
				}

			}

		}

		for (int i = start; i < start + maxL; i++) {
			System.out.println(i);
		}

	}

}
