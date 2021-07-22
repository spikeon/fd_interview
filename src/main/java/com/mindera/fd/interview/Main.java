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
		question1a( stringsList );
		question1b( stringsList );
		question1c( stringsList );
		question1d( stringsList );
		// question3a();
		// question3b();
		// question3c();
		// question5("a","b","c","d");
		print( question6( Arrays.asList( Arrays.asList( "Col 1", "Col 2", "Col 3", "Col 4" ),
				Arrays.asList( "Row 1 Col 1", "Row 1 Col 2", "Row 1 Col 3", "Row 1 Col 4" ) ) ) );

	}

	public void print( String s ) {
		System.out.println( s );
	}

	public void question1a( List<String> list ) {
		// Print each item in the list
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
		// SinglePringle.getInstance();
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
