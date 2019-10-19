package Lec18;

import Lec17.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * data.length];

			for (int i = 0; i < size; i++) {
				int idx = (front + i) % data.length;
				na[i] = data[idx];
			}

			data = na;
			front = 0;
		}

		super.enqueue(item);

	}
}
