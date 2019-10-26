package Lec22;

import java.util.Scanner;

public class BinaryTree {

	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner scn = new Scanner(System.in);

	public BinaryTree() {

		root = construct(null, false);
	}

	public Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node? ");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data + "? ");
			} else {
				System.out.println("Enter the data for right child of " + parent.data + "? ");
			}
		}

		Node nn = new Node();
		int item = scn.nextInt();
		nn.data = item;

		System.out.println("is left child of " + nn.data + "? ");
		boolean lc = scn.nextBoolean();

		if (lc) {
			nn.left = construct(nn, true);
		}

		System.out.println("is right child of " + nn.data + "? ");
		boolean rc = scn.nextBoolean();

		if (rc) {
			nn.right = construct(nn, false);
		}

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

}
