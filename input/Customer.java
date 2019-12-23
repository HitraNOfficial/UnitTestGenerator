package com.hitran;

import java.math.BigDecimal;

public class Customer {

	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private BigDecimal currentCashBalance;
	private Boolean isMarried;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		if (firstName == null || firstName.isEmpty()) {
			throw new RuntimeException("First name of customer cannot be empty!");
		}

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			throw new RuntimeException("Last name of customer cannot be empty!");
		}

		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {

		if (age == null || age.intValue() <= 0) {
			throw new RuntimeException("Age must be a positive number!");
		}

		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (email == null || email.isEmpty()) {
			throw new RuntimeException("Email cannot be empty or null!");
		}
		this.email = email;
	}

	public BigDecimal getCurrentCashBalance() {
		return currentCashBalance;
	}

	public void setCurrentCashBalance(BigDecimal currentCashBalance) {
		if (currentCashBalance == null || currentCashBalance.compareTo(BigDecimal.ZERO) <= -1) {
			throw new RuntimeException("Cash cannot be under zero! We are not a bank!");
		}
		this.currentCashBalance = currentCashBalance;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		if (isMarried == null) {
			throw new RuntimeException("Is married cannot be null!");
		}
		this.isMarried = isMarried;
	}

}
