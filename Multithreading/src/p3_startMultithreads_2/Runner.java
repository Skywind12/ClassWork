package p3_startMultithreads_2;

public class Runner implements Runnable {
	
	@Override
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
