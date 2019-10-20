package Lec19;

import Lec17.Queue;
import Lec18.DynamicQueue;

public class StackusingQueue {

	Queue primary = new DynamicQueue();

	public void push(int item) throws Exception {

		primary.enqueue(item);
	}

	public int pop() throws Exception {

		try {
			Queue helper = new DynamicQueue();

			while (primary.size() > 1) {
				helper.enqueue(primary.dequeue());

			}

			int temp = primary.dequeue();

			while (!helper.isEmpty()) {
				primary.enqueue(helper.dequeue());
			}

			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}

	}
}
