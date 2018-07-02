public class FizzBuzz {
	public void fizzBuzz(int n) {
		for (int i=1; i <= n; i++) {
			String div = "";
			div += (i % 3 == 0) ? "Fizz" : "";
			div += (i % 5 == 0) ? "Buzz" : "";
			System.out.println((div.equals("")) ? i : div);

		}
	}
}
