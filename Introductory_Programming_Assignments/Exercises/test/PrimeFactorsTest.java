import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrimeFactorsTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private PrimeFactors primeFactors;

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		primeFactors = new PrimeFactors();
	}

	@After
	public void restore() {
		System.setOut(originalOut);
	}

	@Test
	public void GeneratePrimeFactorsOfThirty() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);

		assertEquals(primeFactors.generate(30).toString(), expected.toString());
	}

	@Test
	public void OneShouldReturnAnEmptyList() {
		ArrayList<Integer> expected = new ArrayList<Integer>();

		assertTrue(primeFactors.generate(1).isEmpty());
		assertEquals(primeFactors.generate(1).toString(), expected.toString());
	}
}
