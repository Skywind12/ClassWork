package p1;

public class demo {

	public static void main(String[] args) {
		Student s = new Student("Jahleel", 3.2);
		
		StudentObserver o1 = new StudentObserver(s);
		StudentObserver o2 = new StudentObserver(s);
		
		
		s.unregister(o2);
		s.setGPA(3.1);
		
	}

}
