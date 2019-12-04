package multithreaded_version;

public class OrderTaker extends Thread {
	private static int orderNumber = 1;

	private int count = 0;
	private int maxOrders;
	private OrderQueue orderQueue;

	public OrderTaker(int orderCount, OrderQueue orderQueue) {
		this.maxOrders = orderCount;
		this.orderQueue = orderQueue;

	}

	public void run() {
		Order order;
		while (count < maxOrders) {
			order = new Order(getOrderNumber());
			orderQueue.pushOrder(order);
			System.out.println(order.toString() + " created by " + this.getName());
			count++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private synchronized int getOrderNumber() {
		// TODO Auto-generated method stub
		return orderNumber;
	}
}
