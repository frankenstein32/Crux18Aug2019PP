package Lec25;

public class BST {

	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {

		root = construct(arr, 0, arr.length - 1);
	}

	public Node construct(int[] arr, int lo, int hi) {

		if (lo > hi) {
			return null;
		}

		int mid = (hi + lo) / 2;
		Node nn = new Node();
		nn.data = arr[mid];

		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);

		return nn;

	}

	public void display() {

		display(root);
	}

	public void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}

		str += "<-" + node.data + "->";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int max() {

		return max(root);
	}

	private int max(Node node) {

		if (node.right == null) {
			return node.data;
		}

		int m = max(node.right);

		return m;

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		// Redundant
		if (node.data == item) {
			return true;
		}

		if (node.data > item) {
			return find(node.left, item);
		} else if (node.data < item) {
			return find(node.right, item);
		} else {
			return true;
		}

	}

	public void printInrange(int ll, int ul) {

		printInrange(root, ll, ul);
	}

	private void printInrange(Node node, int ll, int ul) {

		if (node == null) {
			return;
		}

		if (node.data < ll) {
			printInrange(node.right, ll, ul);
		} else if (node.data > ul) {
			printInrange(node.left, ll, ul);
		} else {

			printInrange(node.left, ll, ul);
			System.out.print(node.data + " ");
			printInrange(node.right, ll, ul);
		}

	}

	private int sum = 0;

	public void replaceWithLarger() {

		replaceWithLarger(root);
	}

	public void replaceWithLarger(Node node) {

		if (node == null) {
			return;
		}

		replaceWithLarger(node.right);

		int temp = node.data;
		node.data = sum;
		sum += temp;

		replaceWithLarger(node.left);

	}

	public void replaceWithLarger2() {
		replaceWithLarger(root, 0);
	}

	public int replaceWithLarger(Node node, int ssf) {

		if (node == null) {
			return ssf;
		}

		int traversed_sum = replaceWithLarger(node.right, ssf);

		int temp = node.data;
		node.data = traversed_sum;
		traversed_sum += temp;

		return replaceWithLarger(node.left, traversed_sum);

	}

	public void add_oneLevelBefore(int val) {

		add_oneLevelBefore(root, val);

	}

	public void add_oneLevelBefore(Node node, int val) {

		Node nn = new Node();
		nn.data = val;

		if (val <= node.data && node.left == null) {
			node.left = nn;
			return;
		} else if (val >= node.data && node.right == null) {
			node.right = nn;
			return;
		}

		if (node.data > val) {

			add_oneLevelBefore(node.left, val);
		} else {

			add_oneLevelBefore(node.right, val);
		}

	}

	public void add(int val) {
		add(root, val);
	}

	private Node add(Node node, int val) {

		if (node == null) {

			Node nn = new Node();
			nn.data = val;
			return nn;
		}

		if (node.data > val) {
			node.left = add(node.left, val);
		} else {

			node.right = add(node.right, val);
		}

		return node;

	}

	public void remove(int val) {

		remove(root, val);
	}

	private Node remove(Node node, int val) {

		if (val < node.data) {
			node.left = remove(node.left, val);
		} else if (val > node.data) {
			node.right = remove(node.right, val);
		} else {

			// l == n && r == n
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null && node.right != null) {
				return node.right;
			} else if (node.left != null && node.right == null) {
				return node.left;
			} else {

				int lmax = max(node.left);
				node.left = remove(node.left, lmax);
				node.data = lmax;

			}

		}

		return node;

	}

}
