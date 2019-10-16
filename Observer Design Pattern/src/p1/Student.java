package p1;

import java.util.ArrayList;

public class Student implements Observable {
	private ArrayList<Observer> observerList;
	private String name;
	private double GPA;

	public Student(String name, double GPA) {
		observerList = new ArrayList<>();
		this.name = name;
		this.GPA = GPA;
	}

	public void setName(String name) {
		this.name = name;
	//	notifyObservers();
	}

	public void setGPA(double gPA) {
		GPA = gPA;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observerList.indexOf(o);
		observerList.remove(index);
		System.out.println("Observer " + (index+1) + " was removed.");
	}

	@Override
	public void notifyObservers() {
for(Observer o: observerList) {
	o.update(name, GPA);
}
	}

}
