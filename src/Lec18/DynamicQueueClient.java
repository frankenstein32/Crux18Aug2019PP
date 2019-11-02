package Lec18;

import Lec17.Queue;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue q = new DynamicQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		q.display();
		displayReverse(q, 0);
		q.display();

	}

	public static void displayReverse(Queue q, int cnt) throws Exception {

		if (cnt == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q, cnt + 1);
		System.out.println(temp);

	}

	public static void ActualReverse(Queue q) throws Exception {

		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		ActualReverse(q);
		System.out.println(temp);
		q.enqueue(temp);
	}

}
