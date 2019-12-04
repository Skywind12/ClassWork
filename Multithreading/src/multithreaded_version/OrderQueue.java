package multithreaded_version;

import java.util.LinkedList;

public class OrderQueue {
	private LinkedList<Order> list = new LinkedList<>();

	public synchronized void pushOrder(Order order) {
		list.addLast(order);
		notifyAll();
	}

	public Order pullOrder() {
		while(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list.removeFirst();
	}
}
