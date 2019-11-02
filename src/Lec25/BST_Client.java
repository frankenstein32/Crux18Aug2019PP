package Lec25;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inorder = { 1, 2, 3, 5, 7, 8, 9 };
		BST bst = new BST(inorder);

		bst.display();
//		bst.printInrange(14, 25);
//		bst.replaceWithLarger();
//		bst.replaceWithLarger2();

//		bst.display();
		System.out.println("******");
		bst.add_oneLevelBefore(6);
		bst.display();
	}

}
