package Lec32;

import java.util.HashMap;

import Lec32.SegmentTree.Node;

public class Trie {

	class Node {

		char ch;
		HashMap<Character, Node> children = new HashMap<>();
		boolean EOW;

		public Node(char ch) {
			this.ch = ch;
		}
	}

	private Node root;

	public Trie() {
		root = new Node('*');
	}

	public void addWord(String word) {
		addWord(root, word);
	}

	public void addWord(Node node, String word) {

		if (word.length() == 0) {
			node.EOW = true;
			return;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		if (node.children.containsKey(ch)) {
			addWord(node.children.get(ch), ros);
		} else {
			Node nn = new Node(ch);
			node.children.put(ch, nn);
			addWord(nn, ros);
		}

	}

	public void display() {

		display(root);
	}

	public void display(Node node) {

		System.out.print(node.ch + "-> ");

		for (char child : node.children.keySet()) {
			System.out.print(child + ", ");
		}

		System.out.println();
		for (char child : node.children.keySet()) {
			display(node.children.get(child));
		}

	}

	public boolean findWord(String word) {

		return findWord(root, word);
	}

	public boolean findWord(Node node, String word) {

		if (word.length() == 0) {

//			if(node.EOW) {
//				return true;
//			}else {
//				return false;
//			}

			return node.EOW;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		if (node.children.containsKey(ch)) {

			return findWord(node.children.get(ch), ros);
		} else {
			return false;
		}

	}

	public void removeWord(String word) {

		removeWord(root, word);
	}

	public void removeWord(Node node, String word) {

		if (word.length() == 0) {
			node.EOW = false;
			return;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		if (node.children.containsKey(ch)) {
			removeWord(node.children.get(ch), ros);
		}

		Node child = node.children.get(ch);
		if (child.children.size() == 0 && child.EOW == false) {
			node.children.remove(ch);
		}

	}

}
