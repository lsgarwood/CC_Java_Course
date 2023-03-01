package lessons;

public class Arrays {
	
	/*
	An array holds a fixed number of values of one type. Arrays hold doubles, ints, booleans, or any other primitives. Arrays can also contain Strings as well as object references!

	Each index of an array corresponds with a different value.
	
	Creating and Array Explicitly
	To create an array, we provide a name and declare the type of data it holds:

	double[] prices;
	Just like with variables, we can declare and initialize in the same line. This allows us to explicitly initialize the array to contain the data we want to store :
	
	double[] prices = {13.15, 15.87, 14.22, 16.66};
	We can use arrays to hold Strings and other objects as well as primitives:
	
	String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};
	
	Importing Arrays
	When we printed out the array we created in the last exercise, we saw a memory address that did not help us understand what was contained in the array.

	If we want to have a more descriptive printout of the array itself, we need a toString() method that is provided by the Arrays package in Java.
	
	import java.util.Arrays;
	We put this at the top of the file, before we even define the class!
	
	When we import a package in Java, we are making all of the methods of that package available in our code.
	
	The Arrays package has many useful methods, including Arrays.toString(). When we pass an array into Arrays.toString(), we can see the contents of the array printed out:
	
	import java.util.Arrays;
	 
	public class Lottery(){
	 
	  public static void main(String[] args){
	    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
	    String betterPrintout = Arrays.toString(lotteryNumbers);
	    System.out.println(betterPrintout);
	  }
	 
	}
	This code will print:
	
	[4, 8, 15, 16, 23, 42]
	 */

	public static void main(String[] args) {
		
	}

}
