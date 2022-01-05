package com.mindera.fd.interview;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main( String... args ) {
		/*
			1. Write 4 ways to traverse this list:
			List<String> stringsList = Arrays.asList("Blue", "Green", "Red", "Purple");
			2. Write a singleton class with a getInstance() method. Make the class thread safe.
			3. Give 3 ways to write an infinite loop.
			4. Can static methods be overloaded? Can static methods be overridden?
			5. Write a method signature that accepts a variable number of arguments of type String.
			6. Given a List<List<String>>, output CSV data
		 */
		Main m = new Main();
		m.run();
	}

	public void run() {
		List<String> stringsList = Arrays.asList( "Blue", "Green", "Red", "Purple" );
		printHeader("Question 1a");
		question1a( stringsList );
		printHeader("Question 1b");
		question1b( stringsList );
		printHeader("Question 1c");
		question1c( stringsList );
		printHeader("Question 1d");
		question1d( stringsList );
		printHeader("Question 2");
		question2();
		printHeader("Question 3a");
		// question3a();
		printHeader("Question 3b");
		// question3b();
		printHeader("Question 3c");
		// question3c();
		printHeader("Question 5");
		// question5("a","b","c","d");
		printHeader("Question 6");
		print( question6( Arrays.asList( Arrays.asList( "Col 1", "Col 2", "Col 3", "Col 4" ),
				Arrays.asList( "Row 1 Col 1", "Row 1, Col 2", "Row 1 Col 3", "Row 1 Col 4" ) ) ), "" );

	}
	public void printHeader(String s) {
		print(s + ":", "");
	}
	public void print( String s ) {
		print(s, "- ");
	}
	public void print( String s, String prefix ) {
		System.out.println( prefix + s );
	}

	public void question1a( List<String> list ) {
		// Print each item in the list
		for(String str : list){
			print(str);
		}
	}

	public void question1b( List<String> list ) {
		// Print each item in the list
	}

	public void question1c( List<String> list ) {
		// Print each item in the list
	}

	public void question1d( List<String> list ) {
		// Print each item in the list
	}

	public void question2() {
		SinglePringle p1;// = SinglePringle.getInstance();
		SinglePringle p2;// = SinglePringle.getInstance();

		print("Single Pringle Instances: " + SinglePringle.Instances);

		p1.incrementCount();
		p2.incrementCount();
		p1.incrementCount();

		print("Count: " + p1.getCount());

	}

	public void question3a() {
		// Infinite loop here
	}

	public void question3b() {
		// Infinite loop here
	}

	public void question3c() {
		// Infinite loop here
	}

	public void question5() {
		// Print each parameter here
	}

	public String question6( List<List<String>> data ) {
		// return CSV string
		return "";
	}

}
