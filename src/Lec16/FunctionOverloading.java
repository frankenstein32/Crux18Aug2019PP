package Lec16;

public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(1, 2);
	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(int a, int... args) {

		System.out.println("Variable Args");

		for (int val : args) {
			System.out.println(val);
		}
	}

}
