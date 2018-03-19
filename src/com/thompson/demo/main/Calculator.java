package com.thompson.demo.main;

import com.thompson.demo.factory.OperatorFactory;
import com.thompson.demo.factory.OperatorFactory.Operation;
import com.thompson.demo.operator.AddOperator;
import com.thompson.demo.operator.Operator;

public class Calculator {
	public static void main(String[] args) {
		double result;
		double a = 30;
		double b = 20;
		
		Operator opt = OperatorFactory.createOperator(Operation.ADD);
		result = opt.calculate(a, b);
		System.out.println("a + b = " + result);
		
		opt = OperatorFactory.createOperator(Operation.SUBSTRACT);
		result = opt.calculate(a, b);
		System.out.println("a - b = " + result);
		
		
	}
}
