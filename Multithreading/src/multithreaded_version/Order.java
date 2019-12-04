package multithreaded_version;

public class Order {
//	private static int orderNumber = 0;
	private int orderNumber;
	public Order(int  orderNumber) {
		//orderNumber++;
		this.orderNumber = orderNumber;
		System.out.println("The Order "+orderNumber + " is created");
	}
	public String toString() {
		return "The Order # is: " + orderNumber;
	}
}
