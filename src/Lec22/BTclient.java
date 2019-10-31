package Lec22;

public class BTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "10 true 20 true 40 false false true 50 false " + "false true 30 false true 60 false false";
		BinaryTree bt = new BinaryTree(str);
		bt.display();
		System.out.println("Size: " + bt.size());
		System.out.println("height: " + bt.height());
		System.out.println("max: " + bt.max());
		System.out.println("diamter1: " + bt.diameter());
		System.out.println("diameter2 : " + bt.diameter2());

		System.out.print("PreOrder: ");
		bt.preorder();
		System.out.println();
		System.out.print("PostOrder: ");
		bt.postorder();
		System.out.println();
		System.out.print("InOrder: ");
		bt.inorder();
	}

}
