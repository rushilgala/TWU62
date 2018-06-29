public class FizzBuzz_Ex {
	public static void main(String[] args) {
		FizzBuzz();
	}

	private static void FizzBuzz() {
		for (int i=1; i <= 100; i++) {
			String div = "";
			div += (i % 3 == 0) ? "Fizz" : "";
			div += (i % 5 == 0) ? "Buzz" : "";
			System.out.println((div.equals("")) ? i : div);

		}
	}
}
