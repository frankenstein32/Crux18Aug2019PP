package Lec31;

import java.util.ArrayList;

public class Heap {

	protected ArrayList<Integer> data = new ArrayList<>();

	//O(1)
	public int size() {
		return data.size();
	}

	// logn
	public void add(int item) {

		// 1. add at Last
		data.add(item);

		// 2. Upheapify
		upheapify(data.size() - 1);

	}

	// O(logn)
	public void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (data.get(pi) > data.get(ci)) {
			swap(ci, pi);
			upheapify(pi);

		}
	}

	//O(1)
	public void swap(int i, int j) {

		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	//O(1)
	public void display() {

		System.out.println(data);
	}

	//O(1)
	public int getMin() {

		return data.get(0);
	}

	// O(logn)
	public int remove() {

		swap(0, data.size() - 1);
		int temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;

	}

	// O(logn)
	public void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int mini = pi;

		if (lci < data.size() && data.get(lci) < data.get(mini)) {
			mini = lci;
		}

		if (rci < data.size() && data.get(rci) < data.get(mini)) {
			mini = rci;
		}

		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

}
