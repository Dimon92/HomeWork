package HomeWorks8;

import java.util.ArrayList;

import java.util.Stack;

public class Graph {
	int data;
	public ArrayList<Graph> graph;

	public int getData() {
		return data;
	}

	public Graph(int data) {
		graph = new ArrayList<Graph>();
		this.data = data;
	}

	public int[] DejkstraAlg(Graph vertice) {
		int[] a = new int[graph.size()];
		int first = 0;
		for (int i = 0; i < graph.size(); i++) {
			a[i] = Integer.MAX_VALUE;
			if (graph.get(i).getData() == vertice.getData()) {
				a[i] = 0;
				first = i;
			}
		}
		Stack<Graph> s = new Stack<Graph>();
		s.push(graph.get(first));
		Graph g = new Graph(-1);
		int edge = 0;
		while (!s.isEmpty()) {
			g = s.pop();
			edge = 0;
			while (edge != g.graph.size()) {
				int num = 0, num1 = 0;
				for (int i = 0; i < graph.size(); i++) {
					if (graph.get(i).getData() == g.getData())
						num = i;
				}
				for (int i = 0; i < graph.size(); i++) {
					if (((Graph) g.graph.get(edge)).getData() == graph.get(i).getData())
						num1 = i;

				}
				if (g.graph.get(edge) + a[num] < a[num1]) {
					a[num1] =  g.graph.get(edge) + a[num];
				}
				s.push((Graph) g.graph.get(edge));
				edge++;
			}
		}
		return a;
	}

	public void addVertice(Integer vertice) {
		graph.add(vertice);
	}

}
