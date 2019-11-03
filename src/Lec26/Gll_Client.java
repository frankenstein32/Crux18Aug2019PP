package Lec26;

public class Gll_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList_Generic<Car> ll = new LinkedList_Generic<>();

		ll.addFirst(new Car(100, 20, "B"));
		ll.addFirst(new Car(100, 20, "w"));
		ll.addFirst(new Car(100, 20, "s"));
		ll.addFirst(new Car(100, 20, "q"));

		ll.display();

	}

}
