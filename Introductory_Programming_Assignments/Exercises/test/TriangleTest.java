
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TriangleTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private Triangle triangle;

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		triangle = new Triangle();
	}

	@After
	public void restore() {
		System.setOut(originalOut);
	}

	@Test
	public void EasiestReturnsASingleAsterisk() {
		triangle.easiest();
		assertEquals("*\n", outContent.toString());
	}

	@Test
	public void HorizontalReturnsEightAsterisks() {
		triangle.horizontal(8);
		assertEquals("********\n", outContent.toString());
	}

	@Test
	public void VerticalReturnsThreeLinesWithOneAsterisk() {
		triangle.vertical(3);
		assertEquals("*\n*\n*\n", outContent.toString());
	}

	@Test
	public void RightTriangleWithThreeLinesEachWithOneMore() {
		triangle.rightTriangle(3);
		assertEquals("*\n**\n***\n", outContent.toString());
	}
}
