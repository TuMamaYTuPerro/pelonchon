package com.pelones.app.utils;

public class PolishNotationUtils {

	PolishNotationUtils() {
	}

	public int ParseMathExp(String mathExp,DynamicArray<String> dynamicArray) {
		int operCounter = 0;
		Integer index = 0;
		String operator = "";

		while(index.intValue() < mathExp.length()) {
			String oper = getOper(mathExp,index);

			if((operCounter%2) == 0) {
				dynamicArray.add(oper);
			} else {
				if(!operator.equals("")) {
					dynamicArray.add(operator);
				}
				operator = oper;
			}
		}

		dynamicArray.add(operator);
		return operCounter;
	}

	private String getOper(String mathExp, Integer idx) {
		String oper = "";


		return oper;
	}


}
