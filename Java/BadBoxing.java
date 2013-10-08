public class BadBoxing {
	public static void main(String[] args) {
		System.out.println("Boxed\n");
		Boxed();
		System.out.println("Unboxed\n");
		Unboxed();
	}

	private static void Boxed() {
		// Should be a long rather than Long
		Long sum = 0L;

		long start = System.Date();
		for (long i = 0; i <= Integer.MAX_VALUE; i++) {
			// Autoboxes i to Long to add
			sum += i;
		}
		long stop = System.Date();
		double difference = stop - start;
		System.out.println("Took " + difference + "\n");
	}

	public static void Unboxed() {
		// Should be a long rather than Long
		long sum = 0L;

		long start = System.Date();
		for (long i = 0; i <= Integer.MAX_VALUE; i++) {
			// Autoboxes i to Long to add
			sum += i;
		}
		long stop = System.Date();
		double difference = stop - start;
		System.out.println("Took " + difference + "\n");
	}
}