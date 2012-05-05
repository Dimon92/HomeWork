package HomeWorks6;

public class Queue<T> {
	private int size = 15;
	private Object[] data;
	int c = 0;
	int first = 0;

	public Queue(int size) {
		this.size = size;
		data = new Object[this.size];
	}

	public Queue() {
		data = new Object[size];
	}

	public void enqueue(T o) {
		data[(c + first) % data.length] = o;
		c++;
	}

	public T dequeue() {
		c--;
		T a = (T) data[first--];
		return a;
	}

	boolean isEmpty() {
		if (data.length == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return c;
	}
}
