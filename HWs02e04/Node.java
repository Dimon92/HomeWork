package HomeWorks5;

public class Node<T> {
	public T data;
	public Node next;

	Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T a) {
		data = a;
	}
	public void next(Node a) {
		next = a;
	}
}
