package com.qa.accountapplication;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");
		Service service = new Service();
		service.put("John", "Gordan", "000001");
		service.put("Brad", "Hudson-Grant", "000002");
		service.put("Joe", "Mitchell", "000003");
	
		Account person = service.get(1);
		App app = new App();
		app.printAccount(person);
	}
	
	public void printAccount(Account person) {
		System.out.println("Account Number: " + person.getAccountNumber());
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
	}
}
