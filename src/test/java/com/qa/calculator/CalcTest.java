package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.accountapplication.Service;

import calculator.Calc;

public class CalcTest {

	@Test
	public void findNameTest() {
		Service service = new Service();
		service.put("John", "Gordan", "000001");
		service.put("John", "Doe", "000002");
		Calc calcObj = new Calc(service.getMap());
		assertEquals(2, calcObj.calcAmount("John"));
	}

}
