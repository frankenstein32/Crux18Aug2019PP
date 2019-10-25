package Lec21;

public class Gcleint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "10 3 20 2 50 0 60 0 30 0 40 1 70 0";
		GTree gt = new GTree(str);
		gt.display();

//		System.out.println(gt.size());
//		System.out.println(gt.height());
//		System.out.println(gt.max());
//		System.out.println(gt.find(10));
		
		gt.mirror();
		System.out.println("Mirror");
		gt.display();
	}

}
