package Lec31;

import java.util.ArrayList;

public class Heapgeneric<T extends Comparable<T>> {

	protected ArrayList<T> data = new ArrayList<>();

	// O(1)
	public int size() {
		return data.size();
	}

	// logn
	public void add(T item) {

		// 1. add at Last
		data.add(item);

		// 2. Upheapify
		upheapify(data.size() - 1);

	}

	// O(logn)
	public void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (data.get(pi).compareTo(data.get(ci)) < 0) {
			swap(ci, pi);
			upheapify(pi);

		}
	}

	// O(1)
	public void swap(int i, int j) {

		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	// O(1)
	public void display() {

		System.out.println(data);
	}

	// O(1)
	public T getMin() {

		return data.get(0);
	}

	// O(logn)
	public T remove() {

		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;

	}

	// O(logn)
	public void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int Priority = pi;

		if (lci < data.size() && data.get(Priority).compareTo(data.get(lci)) < 0) {
			Priority = lci;
		}

		if (rci < data.size() && data.get(Priority).compareTo(data.get(rci)) < 0) {
			Priority = rci;
		}

		if (Priority != pi) {
			swap(pi, Priority);
			downheapify(Priority);
		}

	}

}
