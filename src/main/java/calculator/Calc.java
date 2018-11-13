package calculator;

import java.util.HashMap;
import java.util.stream.Collectors;

import com.qa.accountapplication.Account;

public class Calc {

	HashMap<Integer, Account> map;

	public Calc(HashMap<Integer, Account> hashMap) {
		map = hashMap;
	}

	public int calcAmount(String chosenName) {
		return map.entrySet().stream().filter(e -> chosenName.equals(e.getValue().getFirstName()))
				.collect(Collectors.toList()).size();
	}
}
