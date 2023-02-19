package lessons;

public class Methods {
	/*
	 * We have seen how to give objects state, through instance fields. Now we will look at how to create object behaviour using methods.
	 * The state tells us what a savings account should know:

	The balance of money available
	The behavior tells us what tasks a savings account should be able to perform:

	Depositing - increasing the amount available
	Withdrawing - decreasing the amount available
	Checking the balance - displaying the amount available.
	
	Methods are repeatable, modular blocks of code used to accomplish specific tasks. We have the ability to define our own methods that will take input, do something with it, and return the kind of output we want.
	 */
	
	// Defining Methods
	/*
	 * If we were to define a checkBalance() method for the Savings Account example we talked about earlier, it would look like the following:

public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
}
The first line, public void checkBalance(), is the method declaration. It gives the program some information about the method:

public means that other classes can access this method. We will learn more about that later in the course.
The void keyword means that there is no specific output from the method. We will see methods that are not void later in this lesson, but for now, all of our methods will be void.
checkBalance() is the name of the method.
Every method has its own unique method signature which is comprised of the method’s name and its parameter type. In this example, the method signature is checkBalance().

The two print statements are inside the body of the method, which is defined by the curly braces: { and }.

Anything we can do in our main() method, we can do in other methods! All of the Java tools you know, like the math and comparison operators, can be used to make interesting and useful methods.
	 */
	
	// Calling Methods
	// we use the dot operator (.) to call the method startEngine(). Note that we must include parentheses () after our method name in order to call it
	
	//Scope
	
}
