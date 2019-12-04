package non_multithreaded_version;

public class Order {
	private static int orderNumber = 0;
	
	public Order() {
		orderNumber++;
		System.out.println("The Order "+orderNumber + " is created");
	}
	public String toString() {
		return "The Order # is: " + orderNumber;
	}
}
