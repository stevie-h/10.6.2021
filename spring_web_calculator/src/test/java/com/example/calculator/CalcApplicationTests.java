package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalcApplicationTests
{

	@Test
	void contextLoads()
	{
	}

	@Test
	public void test_add_small_numbers()
	{
		Calc calc = new Calc();

		double actual_result = calc.add(1, 2);
		double expected_result = 3;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_sub_small_numbers()
	{
		Calc calc = new Calc();

		double actual_result = calc.sub(8, 6);
		double expected_result = 2;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_mul_small_numbers()
	{
		Calc calc = new Calc();

		double actual_result = calc.mul(3, 4);
		double expected_result = 12;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_div_small_numbers_not_zero()
	{
		Calc calc = new Calc();

		double actual_result = calc.div(9, 3);
		double expected_result = 3;

		assertEquals(expected_result, actual_result);
	}


	//missing: exception for div by 0



}
