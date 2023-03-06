package com.functionalPrg;

import java.util.function.Predicate;

public class _Predicate {
	
	public static void main(String[] args) {
		System.out.println("Without Predicate");
		System.out.println(isPhoneNumberValid("917981621664"));
		System.out.println(isPhoneNumberValid("9502358449"));
		System.out.println("With Predicate");
		System.out.println(isPhoneNumberValidPredicate.test("917981621664"));
		System.out.println(isPhoneNumberValidPredicate.test("9502358449"));
		System.out.println("Is phoneNumber valid and contains number 3:"+isPhoneNumberValidPredicate.and(containsNum3).test("917981621664"));
		System.out.println("Is phoneNumber valid and contains number 3:"+isPhoneNumberValidPredicate.and(containsNum3).test("919502358449"));
	}
	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("91")&& phoneNumber.length()==12;
		
	}
	static Predicate<String> isPhoneNumberValidPredicate=phoneNumber->
				phoneNumber.startsWith("91")&&phoneNumber.length()==12;
	static Predicate<String> containsNum3=phoneNumber->
				phoneNumber.contains("3");
}
