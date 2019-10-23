package p1;

public class ConcreteDecorator extends Decorator{
	public void doJob() {
		super.doJob();
		System.out.println("Job done by the ConcreteDecorator class.");
	}
	
}
