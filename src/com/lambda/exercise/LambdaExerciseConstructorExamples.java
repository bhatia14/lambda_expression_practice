package com.lambda.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExerciseConstructorExamples {

	public static void main(String[] args) {
		//String str = "";
		callLambda((str) -> str.length());
		
		DoubleBinaryOperator doubleBinaryOperator = (one, two) -> one + two;
		System.out.println(doubleBinaryOperator.applyAsDouble(10.00001, 1111.111));
		FunctionTest<String> f= (final String ss) ->  ""+ss.length();
		System.out.println(f.funTest("afds"));
		
		
		List<Person> persons = Arrays.asList(
				new Person("Charlies", "Dickens", 78),
				new Person("Lewies", "Carrols",32),
				new Person("Thomas", "Carlyel", 65),
				new Person("Charlotte", "Bronte", 12),
				new Person("Mathew", "Arnold", 18)
			);
		
		persons.forEach(p->System.out.println(p.getFirstName()));
		
		Supplier<String> aa = () -> new String("kjkldajf");
		System.out.println(aa.get());
		
		Supplier<String> aa2 = String::new;
		
		System.out.println(aa2);
		
	}
	private static void callLambda(Function<String,Integer> funct){
		System.out.println(funct.apply("fdsf"));
	}
}

@FunctionalInterface
interface FunctionTest<T>{
	public String funTest(T ar);
	//public String funcTest(T a);
}