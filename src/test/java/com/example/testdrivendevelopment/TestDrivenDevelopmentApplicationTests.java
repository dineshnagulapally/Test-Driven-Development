package com.example.testdrivendevelopment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//@SpringBootTest
class TestDrivenDevelopmentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMultiplication(){
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10),five.times(2));
		assertEquals(Money.dollar(15),five.times(3));
	}

	@Test
	void testEquality(){
		assertEquals(Money.dollar(5),Money.dollar(5));

		Assertions.assertNotEquals(Money.dollar(5), Money.dollar(8));
		assertNotEquals(Money.dollar(5),Money.dollar(8));
	}

	@Test
	void testMultiplicationFr(){
		Money  five = Money.fran(5);
		assertEquals(Money.fran(10),five.times(2));
		assertEquals(Money.fran(15),five.times(3));
	}

	@Test
	void testEqualityFr(){
		assertEquals(Money.fran(5),Money.fran(5));

		Assertions.assertNotEquals(Money.fran(5), Money.fran(8));
	}

	@Test
	void testCurrency(){
		assertEquals("USD",Money.dollar(1).currency());
		assertEquals("CHF",Money.fran(1).currency());
	}



}
