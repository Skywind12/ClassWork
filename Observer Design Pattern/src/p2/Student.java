package p2;

import java.util.Observable;

public class Student extends Observable {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {

		this.name = name;
		this.gpa = gpa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("Observer Notified.");
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

}
