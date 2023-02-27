package lessons;

public class ConditionalsControlFlow {

	/*
	 The if-then statement tests an expression for truth and executes some code based on it.

	if (flip == 1) {
	  System.out.println("Heads!");
	}
	
	The if keyword marks the beginning of the conditional statement, followed by parentheses ().
	The parentheses hold a boolean datatype.
	For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.
	
	The boolean condition is followed by opening and closing curly braces that mark a block of code. This block runs if, and only if, the boolean is true.
	
	boolean isValidPassword = true;
	if (isValidPassword) {
	  System.out.println("Password accepted!");
	} // prints password accepted
	 
	int numberOfItemsInCart = 9;
	if (numberOfItemsInCart > 12) {
	  System.out.println("Express checkout not available");
	} // Nothing is printed.
	
	If a conditional is brief we can omit the curly braces entirely:
	
	if (true) System.out.println("Brevity is the soul of wit");
	Note: Conditional statements do not end in a semicolon.
	 */
	
	/*
	 * If-Then-Else
	 * if (hasPrerequisite) {
 
  // Enroll in course
} else {
  // Enroll in prerequisite
}
	 This conditional statement ensures that exactly one code block will be run. If the condition, hasPrerequisite, is false, the block after else runs.

There are now two separate code blocks in our conditional statement. The first block runs if the condition evaluates to true, the second block runs if the condition evaluates to false.

This code is also called an if-then-else statement:

If condition is true, then do something.
Else, do a different thing.
	 */
	
	/* The If-Then-Else-If
	 * The first condition to evaluate to true will have that code block run. Here’s an example demonstrating the order:

int testScore = 72;
 
if (testScore >= 90) {
 
  System.out.println("A");
 
} else if (testScore >= 80) {
 
  System.out.println("B");
 
} else if (testScore >= 70) {
 
  System.out.println("C");
 
} else if (testScore >= 60) {
 
  System.out.println("D");
 
} else {
 
  System.out.println("F");
 
}
// prints: C
This chained conditional statement has two conditions that evaluate true. Because testScore >= 70 comes before testScore >= 60, only the earlier code block is run.

Note: Only one of the code blocks will run.
	 */
	
	/*
	 * Nested Conditionals
	 * 
	 * We can create more complex conditional structures by creating nested conditional statements, which is created by placing conditional statements inside other conditional statements:

if (outer condition) {
  if (nested condition) {
    Instruction to execute if both conditions are true
  }
}
When we implement nested conditional statements, the outer statement is evaluated first. If the outer condition is true, then the inner, nested statement is evaluated.

Let’s create a program that helps us decide what to wear based on the weather:

int temp = 45;
boolean raining = true;
 
if (temp < 60) {
  System.out.println("Wear a jacket!");
  if (raining == true) {
    System.out.println("Bring your umbrella.");
  } else {
    System.out.println("Leave your umbrella home.");
  }
}
In the code snippet above, our compiler will check the condition in the first if-then statement: temp < 60. Since temp has a value of 45, this condition is true; therefore, our program will print Wear a jacket!.

Then, we’ll evaluate the condition of the nested if-then statement: raining == true. This condition is also true, so Bring your umbrella is also printed to the screen.

Note that, if the first condition was false, the nested condition would not be evaluated.
	 */
	
	/*
	 * Switch Statement
	 * 
	 * An alternative to chaining if-then-else conditions together is to use the switch statement. This conditional will check a given value against any number of conditions and run the code block where there is a match.

Here’s an example of our course selection conditional as a switch statement instead:

String course = "History";
 
switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
This example enrolls the student in History class by checking the value contained in the parentheses, course, against each of the case labels. If the value after the case label matches the value within the parentheses, the switch block is run.

In the above example, course references the string "History", which matches case "History":.

When no value matches, the default block runs. Think of this as the else equivalent.

Switch blocks are different than other code blocks because they are not marked by curly braces and we use the break keyword to exit the switch statement.

Without break, code below the matching case label is run, including code under other case labels, which is rarely the desired behavior.

String course = "Biology";
 
switch (course) {
  case "Algebra": 
    // Enroll in Algebra
  case "Biology": 
    // Enroll in Biology
  case "History": 
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}
 
// enrolls student in Biology... AND History and Theatre!
	 */
	
	public class Order {
		  boolean isFilled;
		  double billAmount;
		  String shipping;
		  String couponCode;
		  
		  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
				if (cost > 24.00) {
		      System.out.println("High value item!");
		    }
		    isFilled = filled;
		    billAmount = cost;
		    shipping = shippingMethod;
		    couponCode = coupon;
		  }
		  
		  public void ship() {
		    if (isFilled) {
		      System.out.println("Shipping");
		      System.out.println("Shipping cost: " + calculateShipping());
		    } else {
		      System.out.println("Order not ready");
		    }
		  }
		  
		  public double calculateShipping() {
		    if (shipping.equals("Regular")) {
		      return 0;
		    } else if (shipping.equals("Express")) {
		      // Add your code here
		      if (couponCode == "ship50") {
		        return 0.85;
		      } else {
		        return 1.75;
		      }
		    } else {
		      return .50;
		    }
		 	}
		  
		  public static void main(String[] args) {
		    // do not alter the main method!
		    Order book = new Order(true, 9.99, "Express", "ship50");
		    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
		    
		    book.ship();
		    chemistrySet.ship();
		  }
		}
}