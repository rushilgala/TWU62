import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private FizzBuzz fizzBuzz;

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		fizzBuzz = new FizzBuzz();
	}

	@After
	public void restore() {
		System.setOut(originalOut);
	}

	@Test
	public void FizzBuzzTheFirstFifteenNumbers() {
		fizzBuzz.fizzBuzz(15);
		String firstFifteenExpectedString = "1\n2\nFizz\n4\nBuzz\nFizz\n7" +
				"\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
		assertEquals(firstFifteenExpectedString, outContent.toString());
	}
}
