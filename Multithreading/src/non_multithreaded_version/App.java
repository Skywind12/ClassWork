package non_multithreaded_version;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderQueue myQueue = new OrderQueue();

		Order order1 = new Order();

		OrderTaker taker1 = new OrderTaker(myQueue, order1);
		OrderHandler handler1 = new OrderHandler(myQueue);
		System.out.println("Order Handled: " + handler1.getOrder().toString());
		
		Order order2 = new Order();
		
		OrderTaker taker2 = new OrderTaker(myQueue, order2);
		OrderHandler handler2 = new OrderHandler(myQueue);
		System.out.println("Order Handled: " + handler2.getOrder().toString());

	}

}
