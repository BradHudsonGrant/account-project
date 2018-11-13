package calculator;

import java.util.HashMap;
import java.util.Map;

import com.qa.accountapplication.Account;

public class Calc {
	
	HashMap<Integer, Account> map;

	public Calc(HashMap<Integer, Account> hashMap) {
		map = hashMap;
	}

	public int calcAmount(String chosenName) {
		int counter = 0;
		
		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
			Account value = entry.getValue();
			if (value.getFirstName().equals(chosenName)) {
				counter++;
			}
		}
		
		return counter;
	}
}
