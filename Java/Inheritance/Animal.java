public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Animal says " + this.name);
	}
}