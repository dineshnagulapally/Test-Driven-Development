package com.example.testdrivendevelopment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class TestDrivenDevelopmentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMultiplication(){
		Dollar five = new Dollar(5);
		Dollar five1 = five.times(2);
		assertEquals(10,five1.amount);
		five1 = five.times(3);
		assertEquals(15,five1.amount);
	}

}
