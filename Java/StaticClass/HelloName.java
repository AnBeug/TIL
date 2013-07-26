public class HelloName {
    public static void main(String [ ] args)
	{
		Hello.say();
        BabyHello.sayMore();
	}

	public static class Hello {
	   private static String name = "Annie";
	   public static void say() {
	       System.out.println("Hello " + name);
	   }
    }

    public static class BabyHello extends Hello {
        public static void sayMore() {
            System.out.println("Ohlo");
        }
    }
}