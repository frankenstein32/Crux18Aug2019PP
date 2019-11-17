package Lec34;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

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

	public void addEdge(int u, int v, int c) {

		matrix[u][v] = c;
		matrix[v][u] = c;
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

				if (matrix[row][col] != 0)
					str += col + "{" + matrix[row][col] + "}, ";
			}

			str += "\n";

		}

		return str;

	}

	public int numEdges() {

		int cnt = 0;

		for (int u = 1; u <= numV; u++) {
			for (int nbr = 1; nbr <= numV; nbr++) {
				if (matrix[u][nbr] != 0) {
					cnt++;
				}
			}
		}
		return cnt / 2;

	}

	public boolean containsEdge(int u, int v) {

		return matrix[u][v] != 0;
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

			if (matrix[src][nbr] != 0 && !visited.containsKey(nbr)) {
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

			if (matrix[src][nbr] != 0 && !visited.containsKey(nbr)) {
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

				if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
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

				if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
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

				System.out.println(rp.data + " via " + rp.psf);

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
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

					if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						stack.addFirst(nbr_pair);
					}

				}
			}
		}

	}

	public boolean isCyclic() {

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
					return true;
				}

				System.out.println(rp.data + " via " + rp.psf);

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						queue.addLast(nbr_pair);
					}

				}
			}
		}

		return false;

	}

	public boolean isConnected() {

		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		int cnt = 0;

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			cnt++;

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

				System.out.println(rp.data + " via " + rp.psf);

				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						queue.addLast(nbr_pair);
					}

				}
			}
		}

		return cnt == 1;

	}

	public boolean isTree() {

		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<Integer>> getCC() {

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> visited = new HashMap<>();

		for (int src = 1; src <= numV; src++) {

			if (visited.containsKey(src)) {
				continue;
			}

			ArrayList<Integer> curr = new ArrayList<Integer>();

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

				System.out.println(rp.data + " via " + rp.psf);

				curr.add(rp.data);
				visited.put(rp.data, true);

				for (int nbr = 1; nbr <= numV; nbr++) {

					if (matrix[rp.data][nbr] != 0 && !visited.containsKey(nbr)) {
						pair nbr_pair = new pair();
						nbr_pair.data = nbr;
						nbr_pair.psf = rp.psf + nbr;

						queue.addLast(nbr_pair);
					}

				}
			}

			res.add(curr);
		}

		return res;
	}

	class prims_pair {

		int vertex;
		int cost;

		public prims_pair(int v, int c) {
			vertex = v;
			cost = c;
		}
	}

	class result_pair {

		int parent;
		int weight;
	}

	public void PrintMST() {

		int[] cost = new int[numV + 1];
		result_pair[] result_set = new result_pair[numV + 1];

		boolean[] mst = new boolean[numV + 1];

		for (int i = 1; i <= numV; i++) {
			cost[i] = Integer.MAX_VALUE;
			result_set[i] = new result_pair();
		}

		PriorityQueue<prims_pair> pq = new PriorityQueue<>(new Comparator<prims_pair>() {
			@Override
			public int compare(prims_pair o1, prims_pair o2) {
				return o1.cost - o2.cost;
			}
		});

		cost[1] = 0;
		prims_pair np = new prims_pair(1, 0);
		result_set[1].parent = -1;

		pq.add(np);

		while (!pq.isEmpty()) {

			prims_pair rp = pq.poll();

			int extractedV = rp.vertex;
			mst[extractedV] = true;

			for (int nbr = 1; nbr <= numV; nbr++) {

				if (matrix[extractedV][nbr] != 0 && !mst[nbr]) {

					int oc = cost[nbr];
					int nc = matrix[extractedV][nbr];

					if (nc < oc) {

						cost[nbr] = nc;

						prims_pair nbr_pair = new prims_pair(nbr, nc);
						pq.add(nbr_pair);

						result_set[nbr].parent = extractedV;
						result_set[nbr].weight = nc;

					}

				}
			}

		}

		print_prims(result_set);

	}

	public void print_prims(result_pair[] results) {

		int minCost = 0;
		System.out.println("Minimum Spanning Tree: ");

		for (int i = 1; i <= numV; i++) {

			result_pair temp = results[i];
			String parent = temp.parent == -1 ? "*" : temp.parent + "";
			System.out.println("Edge " + parent + " - " + i + " cost: " + temp.weight);

			minCost += temp.weight;

		}

		System.out.println("Minimum Cost is: " + minCost);
	}

}
