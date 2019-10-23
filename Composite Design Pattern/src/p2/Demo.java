package p2;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket(50.00, "Bill", "10/23");
		Wine w1 = new Wine(29.99, "Bill's", 11);
		ItemList list = new ItemList();
		list.addItem(t1);
		list.addItem(w1);
	}
}
