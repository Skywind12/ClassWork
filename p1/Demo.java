package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(512341);
		c.divide(3);
		System.out.println(c.roundAmount(c.getAmount()));
		c.time(3);
		System.out.println(c.getAmount());
	}

}
