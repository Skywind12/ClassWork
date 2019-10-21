package eager_Initialization;

public class Instructor {
	private static String name;
	private static Instructor _instructor = new Instructor();
	
	private Instructor() { //prevent public instructor
		
	}
	
	
	public static Instructor makeTheInstructor(String name) {
		Instructor.setName(name);
		return _instructor;
	}

	private static void setName(String name) {
		Instructor.name = name;

	}
	
	public static String getName() {
		return name;
	}
}
