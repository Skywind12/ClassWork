package p1;

public abstract class Decorator implements IComponent {

	private IComponent component;

	public void setComponent(IComponent component) {
		this.component = component;
	}

	public void doJob() {
		if (component != null) {
			component.doJob();
		}
	}

}
