package Lec21;

import java.util.ArrayList;
import java.util.Scanner;

public class GTree {

	Scanner scn;

	class Node {

		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GTree(String str) {

		scn = new Scanner(str);
		root = constuct(null, -1);
	}

	public Node constuct(Node parent, int ithc) {

		if (parent == null) {
			System.out.println("Enter the data for root Node? ");
		} else {
			System.out.println("Enter the data for " + ithc + " child of" + parent.data + "? ");
		}

		// Node Created
		Node nn = new Node();
		int item = scn.nextInt();
		nn.data = item;

		// Enter no of child
		System.out.println("child for " + nn.data + " ? ");
		int nc = scn.nextInt();

		// Work for children
		for (int i = 0; i < nc; i++) {
			Node child = constuct(nn, i);
			nn.children.add(child);
		}
		// return self node
		return nn;

	}

	public void display() {

		display(root);
	}

	private void display(Node node) {

		// Self Work
		System.out.print(node.data + "-> ");

		if (node.children.size() == 0) {
			System.out.print(".");
		}

		for (Node child : node.children) {
			System.out.print(child.data + ", ");
		}
		System.out.println();
		// Smaller Problem
		for (Node child : node.children) {
			display(child);
		}

	}

	public int size() {

		return size(root);
	}

	private int size(Node node) {

		int s = 0;

		for (Node child : node.children) {

			s = s + size(child);
		}

		return s + 1;
	}

	public int height() {

		return height(root);
	}

	private int height(Node node) {

		int h = -1;

		for (Node child : node.children) {

			int th = height(child);

			h = Math.max(h, th);
		}

		return h + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		int m = node.data;

		for (Node child : node.children) {

			int tm = max(child);
			m = Math.max(m, tm);
		}

		return Math.max(m, node.data);

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node root, int item) {

		if (root.data == item) {
			return true;
		}

		for (Node child : root.children) {

			boolean rr = find(child, item);
			if (rr) {
				return true;
			}
		}

		return false;

	}

	public void mirror() {

		mirror(root);
	}

	public void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		int i = 0;
		int j = node.children.size() - 1;

		while (i < j) {

			Node temp = node.children.get(i);
			node.children.set(i, node.children.get(j));
			node.children.set(j, temp);

			i++;
			j--;

		}

	}

	public void preorder() {

		preorder(root);
	}

	private void preorder(Node node) {

		for (Node child : node.children) {
			preorder(child);
		}

		System.out.println(node.data);
	}

}
