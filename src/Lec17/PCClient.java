package Lec17;

public class PCClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P p1 = new P();
		System.out.println(p1.d);
		System.out.println(p1.d1);

//		System.out.println(p1.d2); Error
		p1.fun();
		p1.fun1();

//		p1.fun2(); Error

		C c1 = new C();
		System.out.println(((P) c1).d);
		System.out.println(c1.d); // 5
		System.out.println(c1.d1); // 20
		System.out.println(c1.d2); // 50

		c1.fun();
		c1.fun1();
		c1.fun2();

		P p2 = new C();
//		C c2 = new P(); Error

	}

}
