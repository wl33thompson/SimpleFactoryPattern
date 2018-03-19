package com.thompson.demo.factory;

import com.thompson.demo.operator.AddOperator;
import com.thompson.demo.operator.Operator;
import com.thompson.demo.operator.SubOperator;

public class OperatorFactory {
	public enum Operation{
		ADD, SUBSTRACT
	}
	
	public static Operator createOperator(Operation opt) {
		Operator operator = null;
		
		switch (opt) {
			case ADD:
				operator = new AddOperator();
				break;
			case SUBSTRACT:
				operator = new SubOperator();
			default:
				break;
		}
		
		return operator;
	}
}
