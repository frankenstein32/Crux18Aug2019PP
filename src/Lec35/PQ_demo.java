package Lec35;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_demo {

	static class pair {

		int a;
		int b;

		public pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "a: " + a + " b: " + b;
		}
	}

	static class Comp implements Comparator<pair> {

		@Override
		public int compare(pair o1, pair o2) {
			return o1.a - o2.a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<pair> heap = new PriorityQueue<>(new Comp());

		pair[] pairs = new pair[5];
		pairs[0] = new pair(1, 2);
		pairs[1] = new pair(10, 1);
		pairs[2] = new pair(2, 4);
		pairs[3] = new pair(5, 10);
		pairs[4] = new pair(3, 1);

		for (int i = 0; i < 5; i++) {
			heap.add(pairs[i]);
		}

		while (!heap.isEmpty()) {
			System.out.println(heap.poll());
		}

		PriorityQueue<pair> heap2 = new PriorityQueue<>(new Comparator<pair>() {

			@Override
			public int compare(pair o1, pair o2) {
				return o1.a - o2.a;
			}

		});

		PriorityQueue<Integer> heap3 = new PriorityQueue<>(Comparator.reverseOrder());
		
		heap3.add(1);
		heap3.add(3);
		heap3.add(100);
		heap3.add(23);
		heap3.add(45);
		
		while (!heap3.isEmpty()) {
			System.out.println(heap3.poll());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
