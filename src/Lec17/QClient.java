package Lec17;

public class QClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue q = new Queue();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		q.display();
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(6);
		q.enqueue(7);
		
		
		System.out.println();
		
		q.display();

	}

}
