package HomeWorks2;

public class DequeUsageExample {
	public static void poperror(Deque a) throws DequeOutOfBoundsException {
		if (a.data.length == 0)
			throw new DequeOutOfBoundsException();
		a.popFront();
	}

	public static void main(String[] args) {
		Deque a = new Deque();
		try {
			poperror(a);
		} catch (DequeOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}