package Lec4;

import java.util.Scanner;

public class FunctionDemo {

	static int val = 100;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Part-1
		System.out.println("----------- Part-1 -----------");
		addition();
		subtraction();

		// Part-2
		System.out.println("----------- Part-2 -----------");
		int n1 = 10;
		int n2 = 20;
		additionParams(n1, n2);

		// Part-3
		System.out.println("----------- Part-3 -----------");
		System.out.println(additionReturn(30));

		if (additionReturn(50) > 500) {
			System.out.println("Good");
		}

		// Part-4
		System.out.println("----------- Part-4 -----------");
		int one = 10, two = 20;
		int sum = DemoScopes(one, two);
		System.out.println(sum);

		System.out.println("bye");

		// Part-5
		System.out.println("----------- Part-5 -----------");
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);

		// Part-6
		System.out.println("----------- Part-6 -----------");
		System.out.println(val); // 100
		int val = 200;
		System.out.println(val); // 200
		System.out.println(FunctionDemo.val);// 100
		val++;
		System.out.println(val);
		System.out.println(FunctionDemo.val);
		FunctionDemo.val = FunctionDemo.val + val;
		System.out.println(FunctionDemo.val);

		FunctionDemo.val = 500;
		one = 10;
		val = 30;
		System.out.println(FunctionDemo.val);
		System.out.println(DemoGlobalScopes(one));
		System.out.println(FunctionDemo.val);

	}

	public static int DemoGlobalScopes(int one) {

		FunctionDemo.val = 1000;

		int val = 600;
		int sum = one + val;

		return sum;
	}

	public static void Swap(int one, int two) {
		System.out.println(one + ", " + two);

		int temp = one;
		one = two;
		two = temp;

		System.out.println(one + ", " + two);
	}

	public static int DemoScopes(int one, int nother) {

		int sum = one + another;
		return sum;
	}

	public static int additionReturn(int x) {

		int res = x * x;
		return res;
	}

	public static void additionParams(int a, int temp) {
		int sum = a + temp;
		System.out.println(sum);

	}

	// fxn definition
	public static void addition() {

		int a = 10;
		int b = 20;

		int sum = a + b;

		subtraction();

		System.out.println(sum);

	}

	public static void subtraction() {

		int a = 100;
		int b = 60;

		int sub = a - b;
		System.out.println(sub);

	}

}