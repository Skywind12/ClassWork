package p6_sinchronized_Multithreads;

public class Demo {
	private int count;
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.doWork();
	}
	public void doWork() {
		Thread t1 = new Thread(() -> { 
			for(int i = 0; i < 1000; i++) {
				//count++;
				increment();
			}
		});
		Thread t2 = new Thread(() -> { 
			for(int i = 0; i < 1000; i++) {
				//count++;
				increment();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The count is: " + count);
	}
	
	public synchronized void increment() {
		count++;
	}
}
