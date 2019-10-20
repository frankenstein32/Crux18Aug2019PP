package Lec18;

import Lec16.stack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		stack s = new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);

		s.display();
		System.out.println("*******");
		actualReverse_1(s, new DynamicStack());
		System.out.println("*******");
		s.display();

	}

	public static void displayReverse(stack s) throws Exception {

		if (s.isEmpty()) {
			return;
		}

		int temp = s.pop();
		displayReverse(s);
		System.out.println(temp);
		s.push(temp);

	}

	public static void actualReverse_1(stack s, stack h) throws Exception {

		if (s.isEmpty()) {
			actualReverse_2(s, h);
			return;
		}

		h.push(s.pop());
		actualReverse_1(s, h);

	}

	public static void actualReverse_2(stack s, stack h) throws Exception {

		if (h.isEmpty()) {
			return;
		}

		int temp = h.pop();
		actualReverse_2(s, h);
		s.push(temp);

	}

	public static void nextGreater(int[] arr) throws Exception {

		stack s = new DynamicStack();

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {

				res[s.pop()] = arr[i];
			}

			s.push(i);
		}
		while (!s.isEmpty()) {
			res[s.pop()] = -1;
		}

	}

	public static void stockSpan(int[] arr) throws Exception {

		stack s = new DynamicStack();

		int[] res = new int[arr.length];
//		s.push(0);
//		res[0] = 1;
		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {

				s.pop();

			}

			if (s.isEmpty()) {
				res[i] = i + 1;
			} else {
				res[i] = i - s.peek();
			}

			s.push(i);

		}

	}

}
