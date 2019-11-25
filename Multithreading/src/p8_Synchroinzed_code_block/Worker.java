package p8_Synchroinzed_code_block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	public void fillList1() {
		synchronized (lock1) {
			list1.add(random.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void fillList2() {
		synchronized (lock2) {
			list2.add(random.nextInt(100));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			fillList1();
			fillList2();
		}
		System.out.println(list1);
		System.out.println(list2);
	}

	public void main() {
		Thread t1 = new Thread(() -> {
			process();

		});

		Thread t2 = new Thread(() -> {
			process();
		});
		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken: " + (end - start));
		System.out.println("list1:" + list1.size() + ";" + "list2:" + list2.size());

	}
}
