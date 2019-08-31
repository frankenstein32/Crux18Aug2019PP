package Lec4;
public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;

		// case 1
		// by = sh ;
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo ;

		in = by;
		in = sh;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// case 2
		by = 100; // implict typecasting

		// case 3
		lo = 1_000_000_000_0L;
		System.out.println(lo);

		in = (int) 1_000_000_000_0L;
		System.out.println(in);

		// case 4
		float f = 5.6f;
		double d = 6.7;

		// f = d ;
		d = f;

		// case 5
		in = (int) f;
		System.out.println(in);

		in = 5000;
		f = in;
		System.out.println(f);

		// case 6
		boolean b = true;

		if (b == true) {

		}

		if (b) {

		}

		// case 7
		char ch = 'a';
		System.out.println(ch);

		System.out.println(Math.pow(2, 16)); // 65536

		ch = 98;
		System.out.println(ch);

		in = 'd';
		System.out.println(in);

		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = (char) (ch1 + 1);
		char ch4 = 'a' + 1;
		System.out.println(ch3);

		char c = 65535;
		int res1  =  (char) (c + 1);
		System.out.println("Ans : "  +res1);

		in = 65535 ;
		char res = (char) (in + 100);
		System.out.println(res);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20); // 30Hello1020
		System.out.println(2 + ' ' + 5); // 39
		System.out.println(2 + " " + 5); // 2 5 
		System.out.println("Hello" + '\t' + "World"); // Hello World
		System.out.println("Hello" + "\t" + "World"); // Hello World

		System.out.println('\n' + 2); //
	}

	
	
	
	
}
