package lazy_Initialization;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor i1 = Instructor.makeTheInstructor("Jahleel");
		System.out.println(i1.toString());
		Instructor i2 = Instructor.makeTheInstructor("Sky");
		i2.setName("Adam");
		System.out.println(i1.toString());
	}

}
