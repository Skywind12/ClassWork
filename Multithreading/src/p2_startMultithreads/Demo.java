package p2_startMultithreads;

public class Demo {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		
		runner1.start();
		runner2.start();
		System.out.println("Done");

	}

}
