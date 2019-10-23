package p2;

public class Wine extends ConsumableItem {
	private String producer;
	private int abv;
	private double price;

	public Wine(double price, String producer, int abv) {
		super(price);
		this.producer = producer;
		this.abv = abv;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println(producer + "\t" + abv + "\t" + price);
	}

}
