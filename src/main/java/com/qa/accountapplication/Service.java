package com.qa.accountapplication;

import java.util.HashMap;

public class Service {
 private HashMap<Integer, Account> newMap = new HashMap<Integer, Account>();
 private int hashMapKey = 0;
	
	public void put(String firstName, String lastName, String accountNumber) {
		Account newAccount = new Account();
		newAccount.setFirstName(firstName);
		newAccount.setLastName(lastName);
		newAccount.setAccountNumber(accountNumber);
		newMap.put(hashMapKey, newAccount);
		System.out.println("Accounts created -- Key is " + hashMapKey);
		hashMapKey++;
	}
	public Account get(int keyForAccount) {
		Account person = newMap.get(keyForAccount);
		return person;
	}
}
