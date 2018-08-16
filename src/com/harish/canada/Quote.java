package com.harish.canada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Quote {
	private String quote;
	private int count;

	public String getQuote() {
		return quote;
	}

	public int getCount() {
		return count;
	}

	// countQuotes method will count the number of quotes
	public int countQuotes(String file_name) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(file_name));
		String str;
		int count = 0;
		while ((str = in.readLine()) != null) {
			if (str.equals(""))
				count++;
			System.out.println(str);
		}
		count = count - 1;
		System.out.println("count " + count);
		in.close();
		return count;

	}

	// addEntry method will add the quote to end of file
	public void addEntry(String text) throws IOException {
		Writer output = new BufferedWriter(
				new FileWriter("D://String/Java_Project/src/com/harish/files/quotes.txt", true));
		output.append(text);
		output.close();
	}

	// quoteSearch method will search the quotes containing word keyword
	public void quoteSearch(String word,int count) throws IOException {
		BufferedReader in = new BufferedReader(
				new FileReader("D://String/Java_Project/src/com/harish/files/quotes.txt"));
		String str;
		String quote = "";
		String arr[] = new String[count+1];
		int i = 0;
		System.out.println("******************");
		while ((str = in.readLine()) != null) {
			if (!str.equals(""))
				quote = quote + str;
			else {
				arr[i] = quote;
				i++;
				quote = "";
			}
		}
		System.out.println(arr.length);
		for (int j = 0; j < arr.length; j++) {
			String s = arr[j];
			if (s.contains(word))
				System.out.println(s);
		}
		in.close();
	}
}