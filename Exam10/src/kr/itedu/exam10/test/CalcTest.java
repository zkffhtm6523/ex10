package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {
	
	@Test
	void test() {
		int n1 = 10, n2 = 20;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 20;
		n2 = 30;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 5;
		n2 = 5;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
	}
}
