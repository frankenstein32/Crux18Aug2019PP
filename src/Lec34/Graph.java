package Lec34;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private int[][] matrix;
	private int numV;

	public Graph() {

//		numV = 5;
//		matrix = new int[numV + 1][numV + 1];
		this(5);
	}

	public Graph(int N) {

		numV = N;
		matrix = new int[numV + 1][numV + 1];
	}

	public void addEdge(int u, int v) {

		matrix[u][v] = 1;
		matrix[v][u] = 1;
	}

	public void removeEdge(int u, int v) {

		matrix[u][v] = 0;
		matrix[v][u] = 0;
	}

	@Override
	public String toString() {

		String str = "";

		for (int row = 1; row <= numV; row++) {

			str += row + " -> ";

			for (int col = 1; col <= numV; col++) {

				if (matrix[row][col] == 1)
					str += col + ",";
			}

			str += "\n";

		}

		return str;

	}

	public int numEdges() {

		int cnt = 0;

		for (int u = 1; u <= numV; u++) {
			for (int nbr = 1; nbr <= numV; nbr++) {
				if (matrix[u][nbr] == 1) {
					cnt++;
				}
			}
		}
		return cnt / 2;

	}

	public boolean containsEdge(int u, int v) {

		return matrix[u][v] == 1;
	}

	public boolean hasPath(int src, int dst) {

		HashMap<Integer, Boolean> visited = new HashMap<>();
		return hasPath(src, dst, "", visited);
	}

	public boolean hasPath(int src, int dst, String psf, HashMap<Integer, Boolean> visited) {

		// SelfWork
		if (src == dst) {
			System.out.println(psf + dst);
			return true;
		}

		// Mark
		visited.put(src, true);

		for (int nbr = 1; nbr <= numV; nbr++) {

			if (matrix[src][nbr] == 1 && !visited.containsKey(nbr)) {
				boolean rr = hasPath(nbr, dst, psf + src, visited);

				if (rr) {
					return true;
				}
			}
		}

		return false;

	}

	public void hasAllPath(int src, int dst) {

		HashMap<Integer, Boolean> visited = new HashMap<>();
		hasAllPath(src, dst, "", visited);
	}

	public void hasAllPath(int src, int dst, String psf, HashMap<Integer, Boolean> visited) {

		// SelfWork
		if (src == dst) {
			System.out.println(psf + dst);
			return;
		}

		// Mark
		visited.put(src, true);

		for (int nbr = 1; nbr <= numV; nbr++) {

			if (matrix[src][nbr] == 1 && !visited.containsKey(nbr)) {
				hasAllPath(nbr, dst, psf + src, visited);
			}
		}

		visited.remove(src);
	}

	class pair {
		int data;
		String psf;
	}

	public boolean BFS(int src, int dst) {

		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		pair np = new pair();
		np.data = src;
		np.psf = src + "";

		queue.addLast(np);

		while (!queue.isEmpty()) {
			pair rp = queue.removeFirst();
			// isCyclic
			if (visited.containsKey(rp.data)) {
				continue;
			}
			visited.put(rp.data, true);
			if (rp.data == dst) {
				System.out.println(rp.psf);
				return true;
			}
			for (int nbr = 1; nbr <= numV; nbr++) {

				if (matrix[rp.data][nbr] == 1 && !visited.containsKey(nbr)) {
					pair nbr_pair = new pair();
					nbr_pair.data = nbr;
					nbr_pair.psf = rp.psf + nbr;

					queue.addLast(nbr_pair);
				}

			}
		}

		return false;

	}

	public boolean DFS(int src, int dst) {

		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		pair np = new pair();
		np.data = src;
		np.psf = src + "";

		stack.addFirst(np);

		while (!stack.isEmpty()) {
			pair rp = stack.removeFirst();
			// isCyclic
			if (visited.containsKey(rp.data)) {
				continue;
			}
			visited.put(rp.data, true);
			if (rp.data == dst) {
				System.out.println(rp.psf);
				return true;
			}
			for (int nbr = 1; nbr <= numV; nbr++) {

				if (matrix[rp.data][nbr] == 1 && !visited.containsKey(nbr)) {
					pair nbr_pair = new pair();
					nbr_pair.data = nbr;
					nbr_pair.psf = rp.psf + nbr;

					stack.addFirst(nbr_pair);
				}

			}
		}

		return false;

	}

	public void BFT() {

		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair();
			np.data = src;
			np.psf = src + "";

			queue.addLast(np);

			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				// isCyclic
				if (visited.containsKey(rp.data)) {
					continue;
				}
				
				
				System.out.println(rp.data +" via "+ rp.psf);

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] == 1 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						queue.addLast(nbr_pair);
					}

				}
			}
		}

	}

	public void DFT() {

		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			pair np = new pair();
			np.data = src;
			np.psf = src + "";

			stack.addFirst(np);

			while (!stack.isEmpty()) {
				pair rp = stack.removeFirst();
				// isCyclic
				if (visited.containsKey(rp.data)) {
					continue;
				}
				
				System.out.println(rp.psf);
				
				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] == 1 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						stack.addFirst(nbr_pair);
					}

				}
			}
		}

	}

	
	
}
