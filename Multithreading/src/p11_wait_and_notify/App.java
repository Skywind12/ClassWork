package p11_wait_and_notify;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Processor p1 = new Processor();
		Thread t1 = new Thread(() ->{ 
			try {
				p1.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() ->{ 
			try {
				p1.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
