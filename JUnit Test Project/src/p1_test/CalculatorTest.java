package p1_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import p1.Calculator;

class CalculatorTest {

	@Test
	void testTime() {
		Calculator c = new Calculator(5);
		c.time(2);
		assertEquals(10,c.getAmount(),0.01);
	}
	
	@Test
	void testDivide() {
		Calculator c = new Calculator(10);
		c.divide(0);
		assertEquals(5,c.getAmount(),0.0000001);
	}
	
	@Test
	void roundAmount() {
		Calculator c = new Calculator(1);
		System.out.println(c.roundAmount(1234.12345));
		assertEquals("1,234.12", c.roundAmount(1234.12345));
	}
	@Test
	void testDenominatorIsZero() {
		Calculator c = new Calculator(5);
		assertTrue(c.denominatorIsZero(0));
	}
}
