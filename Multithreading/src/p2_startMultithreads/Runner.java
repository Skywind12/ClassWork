package p2_startMultithreads;

public class Runner extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World!" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
