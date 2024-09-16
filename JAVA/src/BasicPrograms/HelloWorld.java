package BasicPrograms;

@FunctionalInterface
interface Cal {
	void add(String a);
}

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		h.external("sp");
	}

	public void external(String name) {
		// second method

		Cal cal = name1 -> System.out.println(name);
		cal.add("GK");
	}
}
