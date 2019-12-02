package p12_Low_level_producer_consumer;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 3;

	public static Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;
		System.out.println();
		while (true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();

				}
				list.add(value++);
				
				lock.notify();
			}
		}
	}

	public void consume() throws InterruptedException {
		Random random = new Random();
		while (true) {
			synchronized (lock) {
				while (list.size() == 0) {
					lock.wait();
				}
				System.out.println("list size is:" + list.size());
				int value = list.removeFirst();
				System.out.println("value is: " + value);
				lock.notify();
				Thread.sleep(random.nextInt(1000));
				
			}//lock is given up when synchronized block is finished
		
		}
	}
}
