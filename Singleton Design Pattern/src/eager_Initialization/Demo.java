package eager_Initialization;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor i1 = Instructor.makeTheInstructor("Jahleel");
		System.out.println(i1.getName());
		Instructor i2 = Instructor.makeTheInstructor("Adam");
		System.out.println(i2.getName());
		
		System.out.println(i1==i2);
		System.out.println(i1.getName());
	}

}
