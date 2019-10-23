package p1;

public class Demo {
	public static void main(String[] args) {
		Component c1 = new Component();
	//	c1.doJob();
		ConcreteDecorator cd1 = new ConcreteDecorator();
		cd1.setComponent(c1);
		cd1.doJob();
	}
}
