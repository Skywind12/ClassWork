package p2;



public class Demo {

	public static void main(String[] args) {
		Student s = new Student("Jahleel", 3.2);
		
		GpaObserver o1 = new GpaObserver(s);
		s.setGpa(3.1);
		GpaObserver o2 = new GpaObserver(s);
		s.setGpa(3.4);
		
		s.deleteObserver(o2);
		s.setGpa(2.0);
	}

}
