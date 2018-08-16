package com.harish.canada;

import java.io.IOException;
import java.util.Scanner;

public class QuoteApp {
	public static void main(String[] args) throws IOException {
		// Create all objects and call all methods that you
		// need here. You have freedom as to how you want to
		// interact with the user.
		String file_name = "D://String/Java_Project/src/com/harish/files/quotes.txt";

		Quote quote = new Quote();

		// Calling countQuotes method
		int count= quote.countQuotes(file_name);

		// Appending quote to end of file using scanner
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		// Calling addEntry method
		/*quote.addEntry(text);
		scanner.close();*/
			
		Scanner scanner1 = new Scanner(System.in);
		String word = scanner1.nextLine();
		System.out.println(word+"***************");
		quote.quoteSearch(word,count);
	}

}