package p2;

import java.util.Scanner;

public class Calculator {

	private double amount;
	private Scanner input;
	

	public Calculator(double d) {
		this.amount = d;
		this.input = new Scanner(System.in);
	}


	public void time(double d) {
		amount*=d;
	}


	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

}
