package Lec26;

import java.util.Comparator;

import Lec5.BubbleSort;

public class client {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4 };

		String[] arr2 = { "abcd", "efgh", "hjue" };
		display(arr2);

		Car[] cars = new Car[5];
		cars[0] = new Car(10, 20, "Black");
		cars[1] = new Car(20, 120, "yello");
		cars[2] = new Car(50, 1020, "Red");
		cars[3] = new Car(2, 1020, "White");
		cars[4] = new Car(60, 100, "Blue");

		display(cars);

		sort(cars);

		System.out.println("After Sorting: ");

		display(cars);

		CarSpeedComparator comp = new CarSpeedComparator();
		sort(cars, comp);

		display(cars);

	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val);
		}

		System.out.println("********");
	}

	public static <T extends Comparable<T>> void sort(T[] arr) {

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static <T> void sort(T[] arr, Comparator<T> comp) {

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {

				if (comp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}
