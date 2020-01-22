package Lec22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner scn;

	public BinaryTree(String str) {

		scn = new Scanner(str);
		root = construct(null, false);
	}

	public Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}

		Node node = new Node();
		node.data = pre[plo];

		int nel = 0;
		int si = -1;

		for (int i = ilo; i <= ihi; i++) {

			if (node.data == in[i]) {
				si = i;
				break;
			}

			nel++;
		}

		node.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		node.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return node;

	}

	public Node construct(Node parent, boolean ilc) {

		Node nn = new Node();
		int item = scn.nextInt();
		nn.data = item;

		boolean lc = scn.nextBoolean();

		if (lc) {
			nn.left = construct(nn, true);
		}

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

	public int size() {
		return size(root);
	}

	public int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;

	}

	public int max() {
		return max(root);
	}

	public int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));

	}

	public boolean find(int item) {
		return find(root, item);
	}

	public boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		boolean lans = find(node.left, item);
		boolean rans = find(node.right, item);

		return lans || rans;
	}

	public int height() {
		return height(root);
	}

	public int height(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;

	}

	public int diameter() {

		return diameter(root);

	}

	public int diameter(Node node) {

		if (node == null) {
			return 0;
		}

		int lans = diameter(node.left);
		int rans = diameter(node.right);

		int self = height(node.left) + height(node.right) + 2;

		return Math.max(self, Math.max(lans, rans));

	}

	public int diameter2() {
		return diameter2(root).d;
	}

	class diaPair {

		int d = 0;
		int ht = -1;
	}

	public diaPair diameter2(Node node) {

		if (node == null) {

			return new diaPair();
		}

		diaPair lpair = diameter2(node.left);
		diaPair rpair = diameter2(node.right);

		diaPair spair = new diaPair();
		spair.ht = Math.max(lpair.ht, rpair.ht) + 1;

		int self = lpair.ht + rpair.ht + 2;

		spair.d = Math.max(self, Math.max(lpair.d, rpair.d));

		return spair;

	}

	public boolean isBalanced(Node node) {

		if (node == null) {
			return true;
		}

		boolean isL = isBalanced(node.left);
		boolean isR = isBalanced(node.right);

		int bf = height(node.left) - height(node.right);

		return isL && isR && (bf == 0 || bf == -1 || bf == 1);

	}

	class balPair {

		boolean isb = true;
		int ht = -1;
	}

	public balPair isBalanced2(Node node) {

		if (node == null) {
			return new balPair();
		}

		balPair lp = isBalanced2(node.left);
		balPair rp = isBalanced2(node.right);

		balPair sp = new balPair();

		sp.ht = Math.max(lp.ht, rp.ht) + 1;

		int bf = lp.ht - rp.ht;

		sp.isb = lp.isb && rp.isb && (bf == 0 || bf == -1 || bf == 1);

		return sp;
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {

		if (node == null) {
			return;
		}

		// self work
		System.out.print(node.data + " ");

		// smaller problem
		preorder(node.left);
		preorder(node.right);

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {

		if (node == null) {
			return;
		}

		// smaller problem
		postorder(node.left);
		postorder(node.right);

		// self work
		System.out.print(node.data + " ");

	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {

		if (node == null) {
			return;
		}

		// smaller problem
		inorder(node.left);

		// self work
		System.out.print(node.data + " ");

		inorder(node.right);

	}

	class pair {

		Node node;
		boolean sd;
		boolean rd;
		boolean ld;
	}

	public void preorderItr() {

		Stack<pair> s = new Stack<>();

		pair np = new pair();
		np.node = root;
		s.push(np);

		while (!s.isEmpty()) {

			pair rp = s.peek();

			if (rp.node == null) {
				s.pop();
				continue;
			}

			if (rp.sd == false) {
				System.out.print(rp.node.data + " ");
				rp.sd = true;
			} else if (rp.ld == false) {

				pair temp = new pair();
				temp.node = rp.node.left;
				s.push(temp);

				rp.ld = true;
			} else if (rp.rd == false) {

				pair temp = new pair();
				temp.node = rp.node.right;
				s.push(temp);

				rp.rd = true;

			} else {
				s.pop();
			}

		}

	}

	public void postorderItr() {

		Stack<pair> s = new Stack<>();

		pair np = new pair();
		np.node = root;
		s.push(np);

		while (!s.isEmpty()) {

			pair rp = s.peek();

			if (rp.node == null) {
				s.pop();
				continue;
			}

			if (rp.ld == false) {

				pair temp = new pair();
				temp.node = rp.node.left;
				s.push(temp);

				rp.ld = true;
			} else if (rp.rd == false) {

				pair temp = new pair();
				temp.node = rp.node.right;
				s.push(temp);

				rp.rd = true;

			} else if (rp.sd == false) {
				System.out.println(rp.node.data);
				rp.sd = true;
			} else {
				s.pop();
			}

		}

	}

	public void InorderItr() {

		Stack<pair> s = new Stack<>();

		pair np = new pair();
		np.node = root;
		s.push(np);

		while (!s.isEmpty()) {

			pair rp = s.peek();

			if (rp.node == null) {
				s.pop();
				continue;
			}

			if (rp.ld == false) {
				pair temp = new pair();
				temp.node = rp.node.left;
				s.push(temp);

				rp.ld = true;
			} else if (rp.sd == false) {
				System.out.println(rp.node.data);
				rp.sd = true;
			} else if (rp.rd == false) {

				pair temp = new pair();
				temp.node = rp.node.right;
				s.push(temp);

				rp.rd = true;

			} else {
				s.pop();
			}

		}

	}

	class VOPair implements Comparable<VOPair> {

		int data;
		int hLevel;

		public VOPair(int d, int h) {
			data = d;
			hLevel = h;
		}

		@Override
		public String toString() {
			return data + "";
		}

		@Override
		public int compareTo(VOPair o) {
			// TODO Auto-generated method stub
			return this.hLevel - o.hLevel;
		}

	}

	public void verticalorder() {

		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();

		Vorder(root, 0, 0, map);

		ArrayList<Integer> keySet = new ArrayList<>(map.keySet());

		Collections.sort(keySet);

		for (int key : keySet) {

			ArrayList<VOPair> level = map.get(key);

			Collections.sort(level);

			System.out.println(key + " " + level);
		}

	}

	public void Vorder(Node node, int vLevel, int hLevel, HashMap<Integer, ArrayList<VOPair>> map) {

		if (node == null) {
			return;
		}

		if (!map.containsKey(vLevel)) {
			map.put(vLevel, new ArrayList<>());
		}

		ArrayList<VOPair> temp = map.get(vLevel);

		VOPair np = new VOPair(node.data, hLevel);
		temp.add(np);

		Vorder(node.left, vLevel - 1, hLevel + 1, map);
		Vorder(node.right, vLevel + 1, hLevel + 1, map);

	}

	public void kFar(int k, int dst) {
		kFar(this.root, k, dst);
	}

	private int kFar(Node node, int k, int dst) {

		if (node == null) {
			return -1;
		}

		if (node.data == dst) {
			kDown(node, 0, k);
			return 0;
		}

		int ld = kFar(node.left, k, dst);

		if (ld != -1) {

			if (ld + 1 == k) {
				System.out.println(node.data);
			}

			kDown(node.right, 0, k - ld - 2);

			return ld + 1;
		}

		int rd = kFar(node.right, k, dst);

		if (rd != -1) {

			if (rd + 1 == k) {
				System.out.println(node.data);
			}

			kDown(node.left, 0, k - rd - 2);

			return rd + 1;
		}

		return -1;

	}

	private void kDown(Node node, int count, int k) {

		if (node == null) {
			return;
		}

		if (count == k) {
			System.out.println(node.data);
			return;
		}

		kDown(node.left, count + 1, k);
		kDown(node.right, count + 1, k);
	}

	public void LCA(int n1, int n2) {

		LCA(root, n1, n2);
	}

	public boolean LCA(Node node, int n1, int n2) {

		if (node == null) {
			return false;
		}

		if (node.data == n1 || node.data == n2) {

			boolean tempL = LCA(node.left, n1, n2);
			boolean tempR = LCA(node.right, n1, n2);

			if (tempL || tempR) {
				System.out.println(node.data);
			}
			return true;

		}

		boolean left = LCA(node.left, n1, n2);
		boolean right = LCA(node.right, n1, n2);

		if (left && right) {
			System.out.println(node.data);
		}

		return left || right;

	}

}
