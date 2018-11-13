package com.qa.accountapplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintAccountDetails {
	
	public static void printAccount(Account person) {
		System.out.println("Account Number: " + person.getAccountNumber());
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
	}

	public static void printAccountJSON(Account person){
		ObjectMapper objMapper = new ObjectMapper();
		String stringForJSON = "";
		try {
			stringForJSON = objMapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(stringForJSON);
	}
}
