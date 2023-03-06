package com.functionalPrg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeDeclarativeApproach {
	public static void main(String[] args) {
		List<Person> people=List.of(
		new Person("Kalpana",Gender.FEMALE),
		new Person("Bhavani",Gender.FEMALE),
		new Person("Anjali",Gender.FEMALE),
		new Person("ManiSai",Gender.MALE),
		new Person("Saipavan",Gender.MALE)
	);
		//Imperative Approach
		System.out.println("Imperative Approach..");
		List<Person> females=new ArrayList<>();
		for(Person person:people) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		for(Person female:females) {
			System.out.println(female);
		}
		//Declarative Approach
		System.out.println("Declarative Approach..");
		Predicate<Person> personPredicate=person->Gender.MALE.equals(person.gender);
		List<Person> male=people.stream().filter(personPredicate).collect(Collectors.toList());
		male.forEach(System.out::println);
	}
	static class Person{
	private final String name;
	private final  Gender gender;
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	}
	enum Gender{
		MALE,FEMALE
	}
}
