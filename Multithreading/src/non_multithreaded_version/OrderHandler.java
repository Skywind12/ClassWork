package non_multithreaded_version;

public class OrderHandler {
	private Order order;

	public OrderHandler(OrderQueue orderQueue) {
		this.order = orderQueue.pullOrder();

	}

	public Order getOrder() {
		return this.order;
	}
}
