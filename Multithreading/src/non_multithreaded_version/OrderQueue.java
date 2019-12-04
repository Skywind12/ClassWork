package non_multithreaded_version;

import java.util.LinkedList;

public class OrderQueue {
	private LinkedList<Order> list = new LinkedList<>();

	public void pushOrder(Order order) {
		list.addLast(order);
	}

	public Order pullOrder() {
		return list.removeFirst();
	}
}
