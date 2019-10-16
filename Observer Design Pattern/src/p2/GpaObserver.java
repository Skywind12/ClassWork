package p2;

import java.util.Observable;
import java.util.Observer;

public class GpaObserver implements Observer {
	private String name;
	private double gpa;

	private static int idTracker;
	private int id;

	private Student student;

	public GpaObserver(Student student) {

		this.student = student;
		this.id = ++idTracker;
		System.out.println("New Observer: " + id);
		this.student.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg1) {
		System.out.println(((Student) o).getName() + " : " + ((Student) o).getGpa());
		
		System.out.println(arg1);
	}

}
