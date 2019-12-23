package com.hitran;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {

	@Test
	public void testSetAndGet_firstName() {
		String testData = new String("test");
		Customer testClass = new Customer();
		testClass.setFirstName(testData);
		String testResult = testClass.getFirstName();
		Assert.assertEquals(testResult, testData);
	}

	@Test
	public void testSetAndGet_lastName() {
		String testData = new String("test");
		Customer testClass = new Customer();
		testClass.setLastName(testData);
		String testResult = testClass.getLastName();
		Assert.assertEquals(testResult, testData);
	}

	@Test
	public void testSetAndGet_age() {
		Integer testData = Integer.valueOf(1);
		Customer testClass = new Customer();
		testClass.setAge(testData);
		Integer testResult = testClass.getAge();
		Assert.assertEquals(testResult, testData);
	}

	@Test
	public void testSetAndGet_email() {
		String testData = new String("test");
		Customer testClass = new Customer();
		testClass.setEmail(testData);
		String testResult = testClass.getEmail();
		Assert.assertEquals(testResult, testData);
	}

	@Test
	public void testSetAndGet_currentCashBalance() {
		BigDecimal testData = BigDecimal.valueOf(1);
		Customer testClass = new Customer();
		testClass.setCurrentCashBalance(testData);
		BigDecimal testResult = testClass.getCurrentCashBalance();
		Assert.assertEquals(testResult, testData);
	}

	@Test
	public void testSetAndGet_isMarried() {
		Boolean testData = Boolean.valueOf(true);
		Customer testClass = new Customer();
		testClass.setIsMarried(testData);
		Boolean testResult = testClass.getIsMarried();
		Assert.assertEquals(testResult, testData);
	}

}
