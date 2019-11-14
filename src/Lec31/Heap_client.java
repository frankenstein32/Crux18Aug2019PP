package Lec31;

public class Heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap hp = new Heap();
		hp.add(20);
		hp.add(10);
		hp.add(70);
		hp.add(80);
		hp.add(1);
//		hp.display();
//
//		while (hp.size() != 0) {
//			System.out.println(hp.remove());
//		}

		int[] arr = { 1, 5, 2, 3, 10, 20, 2, 1, 6, 7 };

		KthLargest(arr, 3);
	}

	public static void KthLargest(int[] arr, int k) {

		Heap hp = new Heap();

		for (int i = 0; i < k; i++) {
			hp.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {

			int weakest = hp.remove();
			hp.add(Math.max(weakest, arr[i]));

		}

		while (hp.size() != 0) {
			System.out.println(hp.remove());
		}

	}

}
