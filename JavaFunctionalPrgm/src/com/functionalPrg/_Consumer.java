package com.functionalPrg;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		Customer maria=new Customer("kalpana","999999");
		greetCustomer(maria);
		greetCustomerV2(maria,false);
		// Consumer	Functional Interface
		greetCustomerConsumer.accept(maria);
		
		//BiConsumer Functional Interface
		greetCustomerConsumerV2.accept(maria, false);
	}
	static void greetCustomer(Customer customer) {
		System.out.println("Hello "+customer.customerName+",thanks for registering phone number "+customer.customerPhoneNumber);
	}
	static void greetCustomerV2(Customer customer,boolean showPhoneNumber) {
		System.out.println("Hello "+customer.customerName+",thanks for registering phone number "+(showPhoneNumber?customer.customerPhoneNumber:"********"));
		}
	static Consumer<Customer> greetCustomerConsumer=customer->
	System.out.println("Hello "+customer.customerName+",thanks for registering phone number "+customer.customerPhoneNumber);
	
	static BiConsumer<Customer,Boolean> greetCustomerConsumerV2=(customer,showPhoneNumber)->
	System.out.println("Hello "+customer.customerName+",thanks for registering phone number "+(showPhoneNumber?customer.customerPhoneNumber:"********"));
	
	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
	}
}
