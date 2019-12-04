package p13_countdown_atch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable{
private CountDownLatch latch;
public Processor(CountDownLatch latch) {
	this.latch = latch;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed!");
		latch.countDown();
	}

}
