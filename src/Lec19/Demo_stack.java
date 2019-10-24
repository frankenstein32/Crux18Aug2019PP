package Lec19;

import java.util.LinkedList;
import java.util.Stack;

public class Demo_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.pop();
		s.peek();
		s.isEmpty();

		for (int ele : s) {

			System.out.println(ele);
		}

		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(10);

		for (int ele : ll) {

			System.out.println(ele);
		}

	}

}
