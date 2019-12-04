package non_multithreaded_version;

public class OrderTaker {

	public OrderTaker(OrderQueue orderQueue, Order order) {
		orderQueue.pushOrder(order);
	}
}
