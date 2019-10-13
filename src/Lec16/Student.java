package Lec16;

public class Student {

	String name;
	int age;

	public Student() {
		age = 0;
		name = null;
	}

	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void introduce(String name, int age) {

		this.name = name;
		this.age = age;
		System.out.println("Hii" + this.name + ":" + this.age);
	}

}
