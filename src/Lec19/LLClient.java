package Lec19;

public class LLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
//		ll.addFirst(50);

		System.out.println("Prev LL");
		ll.display();

//		ll.RDI();
//		ll.RPI();
//		ll.RPR();
		ll.RDR();

		System.out.println("Curr LL");
		ll.display();
		
		System.out.println(ll.mid());
		
		ll.createDummyList();
	}

}
