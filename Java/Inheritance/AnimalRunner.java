public class AnimalRunner {
	public static void main(String argv[]) {
		Cat myCat = new Cat("Buffy");
		Animal myAnimal = myCat;

		myCat.sayHello();
		myAnimal.sayHello();
	}
}