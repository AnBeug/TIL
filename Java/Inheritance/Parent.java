public class Parent {
	public static void main(String[] args) {
		System.out.println("hello");
	
		Parent p = new Parent();
		p.Hello();

		Child c = new Child();
		c.Hello();

		Parent p2 = c;
		p2.Hello();

		Parent p3 = new Child();
		p3.Hello();
		((Parent)p3).Hello();
	}

	public void Hello() {
		System.out.println("I am the parent");
		System.out.println(getClass());
	}
}