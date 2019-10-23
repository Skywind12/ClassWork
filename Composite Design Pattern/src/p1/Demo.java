package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket("Bill", "Left 5", "10/23", 50.00);
		Wine w1 = new Wine("Bill's", "2009", 11, 29.99);
		ItemList list = new ItemList();
		list.addItem(t1);
		list.addItem(w1);
	}

}
