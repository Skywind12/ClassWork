package p1;

public class Wine implements IItem {
	private String producer;
	private String vintage;
	private int abv;
	private double price;

	public Wine(String producer, String vintage, int abv, double price) {
		super();
		this.producer = producer;
		this.vintage = vintage;
		this.abv = abv;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println("Producer" + "\tVintage" + "\tbiv" + "\tprice");

	}

}
