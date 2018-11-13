package com.qa.accountapplication;

import com.fasterxml.jackson.core.JsonProcessingException;

public class App {
	public static void main(String[] args) throws JsonProcessingException {
		System.out.println("Hello world to the standard out");
		
		Service service = new Service();
		service.put("John", "Gordan", "000001");
		service.put("Brad", "Hudson-Grant", "000002");
		service.put("Joe", "Mitchell", "000003");

		Account person = service.get(1);
		System.out.println(PrintAccountDetails.printAccountJSON(person));
		person = service.get(2);
		PrintAccountDetails.printAccountJSON(person);
	}

	
}
