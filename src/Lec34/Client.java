package Lec34;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph gp = new Graph(7);

		gp.addEdge(1, 2, 2);
		gp.addEdge(1, 4, 1);
		gp.addEdge(2, 3, 5);
		gp.addEdge(3, 4, 6);
		gp.addEdge(4, 5, 3);
		gp.addEdge(5, 6, 1);
		gp.addEdge(5, 7, 2);
		gp.addEdge(6, 7, 3);
		
		System.out.println(gp);
		
//		gp.removeEdge(4, 5);
		
		System.out.println("-------------");
		System.out.println(gp);
		
		
		System.out.println(gp.hasPath(1, 7));
		System.out.println("All Paths");
		gp.hasAllPath(1, 7);
		
		System.out.println("BFS");
		System.out.println(gp.BFS(1, 7));
		
		System.out.println("DFS");
		System.out.println(gp.DFS(1, 7));
		
		
		System.out.println("BFT");
		gp.BFT();
		
		System.out.println(gp.getCC());
		
		gp.PrintMST();

	}

}
