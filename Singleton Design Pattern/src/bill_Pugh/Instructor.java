package bill_Pugh;

public class Instructor {
	private static Instructor instructor;
	private static String name;

	private Instructor() {
	}

	private static class SingletonHelper {
		private static final Instructor _instructor = new Instructor();
	}

	public static Instructor makeTheInstructor() {
		return SingletonHelper._instructor;
	}

	public static String getName() {
		return name;

	}

	public static void setName(String name) {
		instructor.name = name;
	}
}
