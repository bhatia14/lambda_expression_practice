package com.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExerciseJava7Way {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
					new Person("Charlies", "Dickens", 78),
					new Person("Lewies", "Carrols",32),
					new Person("Thomas", "Carlyel", 65),
					new Person("Charlotte", "Bronte", 12),
					new Person("Mathew", "Arnold", 18)
				);
		//1. Sort the list by last name
		
		Collections.sort(persons, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//2. create method for listing all the name and info
		System.out.println("All values "+persons);
		
		//3. create method to print all people name Starting with C
		for(Person p: persons){
			System.out.println((p.getLastName().startsWith("C"))? p.toString():"");
		}
		
		

	}

}
