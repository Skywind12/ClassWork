package p4_startMultithreads_3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
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

		});

	
	t.start();
	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
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

	});
	t2.start();
		
	}

}
