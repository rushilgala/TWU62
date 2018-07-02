import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DiamondTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private Diamond diamond;

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		diamond = new Diamond();
	}

	@After
	public void restore() {
		System.setOut(originalOut);
	}

	@Test
	public void IsocelesTriangleIsCenteredWhenNisThree() {
		diamond.isocelesTriangle(3);
		assertEquals("  *\n ***\n*****\n", outContent.toString());
	}

	@Test
	public void CenteredDiamondUpToLineNthenBackToOne() {
		diamond.centeredDiamond(3);
		assertEquals("  *\n ***\n*****\n ***\n  *\n", outContent.toString());
	}

	@Test
	public void DiamondWithANameInThirdLine() {
		diamond.diamondWithName(3, "Rushil");
		assertEquals("  *\n ***\nRushil\n ***\n  *\n", outContent.toString());
	}
}
