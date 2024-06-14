package TestsRTU2024.UnitTestProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test is Finished");
	}

	@Test
	void testAdditionPositiveInts() {
		int actual = calculator.addition(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdditionPositiveNegativeInts() {
		int actual = calculator.addition(5, -5);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdditionNegativeInts() {
		int actual = calculator.addition(-5, -5);
		int expected = -10;
		assertEquals(expected, actual);
	}

	@Test
	void testSubstraction() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testDivision() {
		fail("Not yet implemented"); // TODO
	}

}
