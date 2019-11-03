package Lec26;

public class LinkedList_Generic<T> {

	class Node {
		T val;
		Node next;

		public Node() {

			val = null;
			next = null;
		}

		public Node(T data) {
			val = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {

		// return size == 0;
		return head == null;
	}

	public T getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}
		return head.val;
	}

	public T getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}

		return tail.val;
	}

	public void addLast(T item) {

		Node nn = new Node();
		nn.val = item;

		if (isEmpty()) {
			head = nn;
			tail = nn;
			size++;
		} else {

			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public void addFirst(T item) {

		Node nn = new Node();
		nn.val = item;

		if (isEmpty()) {

			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void display() {

		System.out.println("******************");
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println();
		System.out.println("******************");
	}

	public T getAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp.val;

	}

	public Node getNodeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addAt(T item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			// Create Node
			Node nn = new Node();
			nn.val = item;

			// Get Node
			Node pnode = getNodeAt(idx - 1);
			Node cnode = pnode.next;

			// Attach Node
			pnode.next = nn;
			nn.next = cnode;

			size++;
		}

	}

	public T removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!!");
		}

		T temp = head.val;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}

		return temp;
	}

	public T removeLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty!!!");
		}

		T temp = tail.val;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node pnode = getNodeAt(size - 2);
			pnode.next = null;
			tail = pnode;
			size--;
		}

		return temp;
	}

	public T removeAt(int idx) throws Exception {

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {

			Node pnode = getNodeAt(idx - 1);
			Node cnode = pnode.next;
			Node ahead = cnode.next;

			pnode.next = ahead;

			size--;
			return cnode.val;

		}

	}

}
