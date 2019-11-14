package Lec31;

import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Other;

public class GClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heapgeneric<Car> hpg = new Heapgeneric<>();

		Car[] cars = new Car[5];
		cars[0] = new Car(10, 20, "Black");
		cars[1] = new Car(20, 120, "yello");
		cars[2] = new Car(50, 1020, "Red");
		cars[3] = new Car(2, 1020, "White");
		cars[4] = new Car(60, 100, "Blue");

		for (int i = 0; i < 5; i++) {
			hpg.add(cars[i]);
		}

//		hpg.display();
		while (hpg.size() > 0) {
			System.out.println(hpg.remove());
		}

		Heapgeneric2<Car> hpg2 = new Heapgeneric2<Car>(new CarSpeedComparator());

		for (int i = 0; i < 5; i++) {
			hpg2.add(cars[i]);
		}

		System.out.println();

		while (hpg2.size() > 0) {
			System.out.println(hpg2.remove());
		}

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);
		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);
		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);
		lists.get(3).add(2);
		lists.get(3).add(3);

		System.out.println(MergeKsorted(lists));
	}

	static class pair implements Comparable<pair> {

		int d;
		int listno;
		int idxno;

		@Override
		public int compareTo(pair other) {
			return other.d - this.d;
		}

	}

	public static ArrayList<Integer> MergeKsorted(

			ArrayList<ArrayList<Integer>> arr) {
		ArrayList<Integer> res = new ArrayList<>();
		Heapgeneric<pair> hpg = new Heapgeneric<>();

		for (int i = 0; i < arr.size(); i++) {

			pair np = new pair();
			np.d = arr.get(i).get(0);
			np.idxno = 0;
			np.listno = i;

			hpg.add(np);
		}

		while (hpg.size() > 0) {

			pair rp = hpg.remove();

			res.add(rp.d);
			rp.idxno++;

			if (rp.idxno < arr.get(rp.listno).size()) {
				rp.d = arr.get(rp.listno).get(rp.idxno);
				hpg.add(rp);
			}

		}

		return res;

	}

}
