package Lec16;

public class stack {

	int[] data;
	int tos;

	public stack() {
		this.tos = -1;
		data = new int[5];
	}

	public stack(int cap) {

		this.tos = -1;
		this.data = new int[cap];
	}

	public void push(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		data[tos] = item;

	}

	public int pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int temp = data[tos];
		data[this.tos] = 0;
		tos--;

		return temp;

	}

	public int peek() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}

		return data[tos];
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {

//		return tos == -1;
		if (tos == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {

		if (tos == data.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {

		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i]);
		}

	}

}
