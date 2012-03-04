package HomeWorks2;

public class Deque {
	int[] data;

	Deque() {
		data = new int[0];
	}

	public void pushBack(int n) {
		int[] data2 = new int[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			data2[i] = data[i];
		}
		data2[data.length] = n;
		data = data2;
	}

	public int popBack() {
		int[] data2 = new int[data.length - 1];
		int y = data[data.length - 1];
		for (int i = 0; i < data.length - 2; i++) {
			data2[i] = data[i];
		}
		data = data2;
		return y;
	}

	public void pushFront(int n) {
		int[] data2 = new int[data.length + 1];
		for (int i = data2.length; i > 0; i--) {
			data2[i] = data[i - 1];
		}
		data2[0] = n;
		data = data2;
	}

	public int popFront() {
		int y = data[0];
		int[] data2 = new int[data.length - 1];
		for (int i = 1; i < data.length; i++) {
			data2[i - 1] = data[i];
		}
		return y;
	}

	void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}