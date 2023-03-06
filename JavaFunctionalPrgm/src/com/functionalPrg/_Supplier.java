package com.functionalPrg;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	public static void main(String[] args) {
		System.out.println(getDBConnectionUrl());
		//Supplier
		System.out.println(getDBConnectionUrlSupplier.get());
	}
	static String getDBConnectionUrl() {
		return  "jdbc://localhost:8080/users";
	}
	static Supplier<List<String>> getDBConnectionUrlSupplier=()->
		List.of("jdbc://localhost:8080/users","jdbc://localhost:8080/customer");
}
