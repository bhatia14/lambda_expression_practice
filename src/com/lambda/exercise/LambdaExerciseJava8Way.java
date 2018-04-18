package com.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExerciseJava8Way {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Charlies", "Dickens", 78),
				new Person("Lewies", "Carrols",32),
				new Person("Thomas", "Carlyel", 65),
				new Person("Charlotte", "Bronte", 12),
				new Person("Mathew", "Arnold", 18)
			);
	//1. Sort the list by last name
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
	//	2. print all the values in Person object 
		//System.out.println(persons);
		printConditionally(persons, p -> true); //{
		System.out.println();
	//	3. Print only with last name starting with C
		printConditionally(persons, p -> p.getLastName().startsWith("C")); //{


	}
	
	private static void printConditionally(List<Person> persons, Predicate<Person> conditionPrint){
		for(Person p: persons){
			if(conditionPrint.test(p))
				System.out.println(p.toString());
		}
	}

}

@FunctionalInterface
interface ConditionPrint{
	public boolean test(Person p);
}