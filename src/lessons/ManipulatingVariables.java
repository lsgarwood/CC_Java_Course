package lessons;

public class ManipulatingVariables {
	public static void main(String[] args) {
		/*  we have the ability to manipulate the value of our variables. We can use expressions, arithmetic operators, and more in 		order to change our variables’ values. The data type of an expression is determined by the resulting value */
		int mystery1 = 8 + 6;
	    int mystery2 = 8 - 6;
	    System.out.println(mystery2);
	    
	    // addition and subtraction 
	    int zebrasInZoo = 8;
	    int giraffesInZoo = 4;
	    int animalsInZoo = zebrasInZoo + giraffesInZoo;
	    System.out.println(animalsInZoo);
	    int numZebrasAfterTrade = zebrasInZoo - 2;
	    System.out.println(numZebrasAfterTrade);
	    
	    /* Increment operator
	    When we append ++ to a number-based variable, it increases the value by 1.
	    We also have the decrement operator, --, which decreases the value by 1 */
	    int numPicturesOfCats = 60 + 24;
	    // Take a picture
	    numPicturesOfCats++; // Value is now 85
	     
	    // Delete a picture
	    numPicturesOfCats--; // Value is now 84
	    
	    // Multiplication and division
	    double paycheckAmount = 40 * 15.50;
	    //paycheckAmount now holds 620.0
	    
	    double balance = 20010.5;
	    double hourlyRate = 15.5;
	    double hoursWorked = balance / hourlyRate;
	    //hoursWorked now holds 1291.0
	    
	    int evenlyDivided = 10 / 5;
	    //evenlyDivided holds 2, because 10 divided by 5 is 2
	    int unevenlyDivided = 10 / 4;
	    //unevenlyDivided holds 2, because 10 divided by 4 is 2.5
	    
	    // Modulo
	    int cookiesBaked = 10;
	    int cookiesLeftover = 10 % 3;
	    /*
	    //cookiesLeftover holds 1
	    7 % 2
	    // 1, odd!
	    8 % 2
	    // 0, even!
	    9 % 2
	    // 1, odd!
	     */
	    
	    // Compound Assignment
	    int numCupcakes = 12;
	    numCupcakes = numCupcakes + 8; // Value is now 20
	    numCupcakes += 8; // Value is now 20
	    /* We can use compound assignment operators for all of the arithmetic operators we’ve covered:

	    	Addition (+=)
	    	Subtraction (-=)
	    	Multiplication (*=)
	    	Division (/=)
	    	Modulo (%=) */
	    
	    // Order of Operations
	    /*
	     * The order is as follows:

		Parentheses
		Exponents
		Modulo/Multiplication/Division
		Addition/Subtraction
		(parentheses -> multiplication -> division -> modulo -> addition -> subtraction.)
	     */
	    int num = 5 * (10 - 4) + 4 / 2;
	    
	    // (10-4) first - 5 * 6 + 4 / 2 
	    // 5 * 6 next - 30 + 4 / 2
	    // 4 / 2 next - 30 + 2
	    // so num = 32
	    
	    // Greater than and Less Than
	    double bankBalance = 20000.01;
	    double amountToWithdraw = 5000.01;
	    System.out.print(amountToWithdraw < bankBalance);
	    //this will print true, since amountToWithdraw is less than balance
	    double myBalance = 200.05;
	    double costOfBuyingNewLaptop = 1000.05;
	    boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
	    //canBuyLaptop is false, since 200.05 is not more than 1000.05
	    
	    // Equals and Not Equals
	    double paycheckAmount1 = 620;
	    double calculatedPaycheck = 15.50 * 40;
	     
	    System.out.print(paycheckAmount1 == calculatedPaycheck);
	    // This will print true, since paycheckAmount equals calculatedPaycheck
	    
	    double balance1 = 20000.0;
	    double amountToDeposit = 620;
	    double updatedBalance = balance1 + amountToDeposit;
	     
	    boolean balanceHasChanged = balance1 != updatedBalance;
	    // balanceHasChanged holds true, since balance does not equal updatedBalance
	    
	    //Greater/Less Than or Equal To
	    double paycheckAmount2 = 620;
	    double calculatedPaycheck1 = 15.50 * 40;
	    System.out.println(paycheckAmount2 >= calculatedPaycheck1);
	    //this will print true, since paycheckAmount equals calculatedPaycheck
	    
	    // .equals()
	    /* With objects, such as Strings, we can’t use the primitive equality operator. To test equality with objects, we use a built-in method called .equals(). When comparing objects, make sure to always use .equals(). == will work occasionally, but the reason why it sometimes works has to do with how objects are stored in memory */
	    
	    String person1 = "Paul";
	    String person2 = "John";
	    String person3 = "Paul";
	     
	    System.out.println(person1.equals(person2));
	    // Prints false, since "Paul" is not "John"
	     
	    System.out.println(person1.equals(person3));
	    // Prints true, since "Paul" is "Paul"
	    
	    //String Concatenation
	    String username = "PrinceNelson";
	    System.out.println("Your username is: " + username);
	    // Your username is: PrinceNelson
	    // We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first:

    	int balance2 = 10000;
    	String message = "Your balance is: " + balance2;
    	System.out.println(message);
	    // This code will print: Your balance is: 10000
    	
    	// final keyword
    	// To declare a variable with a value that cannot be manipulated, we need to use the final keyword.
    	final int yearBorn = 1986;
    	
    	// When we declare a variable using final, the value cannot be changed; any attempts at doing so will cause an error to occur:
    	// error: cannot assign a value to final variable yearBorn
	}
}
