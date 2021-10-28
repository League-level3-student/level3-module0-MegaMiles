package _01_Simple_Array_Algorithms;

import java.util.Random;
import java.util.ArrayList;


public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[0] = "1";
		strings[1] = "2";
		strings[2] = "3";
		strings[3] = "4";
		strings[4] = "5";
		MoreArrayFun fun = new MoreArrayFun();
		fun.printStrings(strings);
		fun.printReverse(strings);
		fun.everyOther(strings);
		fun.randomStrings(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	

	public void printStrings (String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void printReverse (String[] strings) {
		for (int i = strings.length - 1; i > -1; i--) {
			System.out.println(strings[i]);
		}
	}
	
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void everyOther(String[] strings) {
		for (int i = 0; i < strings.length; i+=2) {
			System.out.println(strings[i]);
		}
	}
	
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public void randomStrings (String[] strings) {
		ArrayList<String> ArrayString = new ArrayList<String>();
		Random ran = new Random();
		for (int i = 0; i < strings.length; i++) {
			ArrayString.add(strings[i]);
		}
		while(!ArrayString.isEmpty()) {
			System.out.println(ArrayString.remove(ran.nextInt(ArrayString.size())));
		}
	}
}
