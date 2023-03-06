package com.abstraction.methods.all;

public class AbstractionMain extends Abstarction {
	public static void main(String[] args) {

		Abstarction a = new AbstractionMain();
		a.finalMethod();
		a.instanceMethod();
		a.staticMethod();
		System.out.println("name " + a.name);

	}
}
