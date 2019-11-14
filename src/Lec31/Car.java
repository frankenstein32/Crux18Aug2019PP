package Lec31;

public class Car implements Comparable<Car> {

	public int speed;
	int price;
	String color;

	public Car(int s, int p, String c) {

		speed = s;
		price = p;
		color = c;
	}

	@Override
	public String toString() {

		return "[S: " + speed + " P:" + price + " C:" + color + "]";
	}

	@Override
	public int compareTo(Car other) {
		// TODO Auto-generated method stub
		return other.price - this.price;
	}

}
