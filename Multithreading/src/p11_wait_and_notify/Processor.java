package p11_wait_and_notify;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("producer is producing...");
			wait();
			System.out.println("producer resumed producing.");
		}
	}

	public void consume() throws InterruptedException {
		Scanner kb = new Scanner(System.in);
		Thread.sleep(1000);
		synchronized (this) {

			System.out.println("waiting for key");
			kb.hasNextLine();
			System.out.println("kb pressed");
			notify();
			Thread.sleep(2000);
		}
	}
}
