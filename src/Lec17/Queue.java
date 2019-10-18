package Lec17;

public class Queue {

	int[] data;
	int front;
	int size;

	public Queue() {

		this(5);
	}

	public Queue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;

	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full");
		}

		data[(front + size) % data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;

		return temp;
	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		return data[front];

	}

	public void display() {

		for (int val : data) {
			System.out.print(val + " ");
		}
		System.out.println();

		System.out.println();
		for (int i = front; i < front + size; i++) {

			int idx = (i) % data.length;
			System.out.print(data[idx] + " ");
		}

		System.out.println();

	}

	public boolean isFull() {

		return data.length == size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

}
