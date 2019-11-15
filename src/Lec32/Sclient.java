package Lec32;

public class Sclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 1, 3, 4, 5, 1, 2 };
		SegmentTree st = new SegmentTree(arr, new MinQuery());

		st.display();
//		System.out.println(st.query(1, 3));
	}

}
