package com.functionalPrg;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		//Function takes one argument and produces one result
		int increment=increment(2);
		System.out.println(increment);
		int incre=incrmentByOneFunc.apply(5);
		System.out.println(incre);
		int multiply=multilyByOneFunc.apply(5);
		System.out.println(multiply);
		
		Function<Integer,Integer> addBy1andMutiplyBy10=incrmentByOneFunc.andThen(multilyByOneFunc);
		
		System.out.println("addBy1andMutiplyBy10 is :"+addBy1andMutiplyBy10.apply(1));
		
		//BiFunction takes two argument and produces one result
		System.out.println(incrementByOneAndMultiply(1,200));
		System.out.println(incrementByOneAndMultiplyBiFunc.apply(1, 400));
	}
	static Function<Integer,Integer> incrmentByOneFunc=number->number+1;
	static Function<Integer,Integer> multilyByOneFunc=number->number*10;
	static int increment(int number) {
		return number+1;
	}
	static int incrementByOneAndMultiply(int number,int numToMultiplyBy) {
		return (number+1) * numToMultiplyBy;
	}
	static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunc=
			(num1,num2)
				->(num1+1)*num2;
}
