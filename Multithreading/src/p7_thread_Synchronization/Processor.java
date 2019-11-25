package p7_thread_Synchronization;

import java.util.Scanner;

public class Processor extends Thread {
	private volatile boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.println("Hi U.U");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		flag = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p1 = new Processor();
		p1.start();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("press rturn to pause: ");
		kb.hasNextLine();
		p1.shutdown();
		
	}

}
