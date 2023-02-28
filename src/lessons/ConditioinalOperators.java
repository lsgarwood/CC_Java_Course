package lessons;

public class ConditioinalOperators {
		
	/*
	Conditional-And: &&
	 
	We have two conditions that must be true before we enroll the student.

	Here’s one way we could write the code:
	
	if (tuitionPaid) {
	  if (hasPrerequisite) {
	    // enroll student
	  }
	}
	We’ve nested two if-then statements. This does the job but we can be more concise with the AND operator:
	
	if (tuitionPaid && hasPrerequisite) {
	  // enroll student
	}
	The AND operator, &&, is used between two boolean values and evaluates to a single boolean value. If the values on both sides are true, then the resulting value is true, otherwise the resulting value is false.
	
	This code illustrates every combination:
	
	true && true
	// true
	false && true
	// false
	true && false
	// false
	false && false
	// false
	*/
	
	/*
	Conditional-Or: ||
	 
	We’re using two different if-then statements with the same code block. We can be more concise with the OR operator:

	if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
	  // Enroll in course
	}
	The OR operator, ||, is used between two boolean values and evaluates to a single boolean value. If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.
	
	This code illustrates every combination:
	
	true || true
	// true
	false || true
	// true
	true || false
	// true
	false || false
	// false
	
	SHORT-CIRCUIT EVALUATION
	
	On some occasions, the compiler can determine the truth value of a logical expression by only evaluating the first boolean operand; this is known as short-circuited evaluation. Short-circuited evaluation only works with expressions that use && or ||.

	In an expression that uses ||, the resulting value will be true as long as one of the operands has a true value. If the first operand of an expression is true, we don’t need to see what the value of the other operand is to know that the final value will also be true.
	
	For example, we can run the following code without error despite dividing a number by 0 in the second operand because the first operand had a true value:
	
	if (1 > 0 || 2 / 0 == 7) {
	  System.out.println("No errors here!");
	}
	An expression that uses && will only result in true if both operands are true. If the first operand in the expression is false, the entire value will be false.
	
	 */
	
	/*
	 Logical-Not: !
	 
	 The unary operator NOT, !, works on a single value. This operator evaluates to the opposite boolean to which it’s applied:

	!false
	// true
	!true
	// false
	NOT is useful for expressing our intent clearly in programs. For example, sometimes we need the opposite behavior of an if-then: run a code block only if the condition is false.
	
	boolean hasPrerequisite = false;
	 
	if (hasPrerequisite) {
	  // do nothing
	} else {
	  System.out.println("Must complete prerequisite course!");
	}
	This code does what we want but it’s strange to have a code block that does nothing!
	
	The logical NOT operator cleans up our example:
	
	boolean hasPrerequisite = false;
	 
	if (!hasPrerequisite) {
	  System.out.println("Must complete prerequisite course!");
	}
	We can write a succinct conditional statement without an empty code block.
	 */
	
	/*
	Combining conditional Operators
	
	We have the ability to expand our boolean expressions by using multiple conditional operators in a single expression.

	For example:
	
	boolean foo = true && !(false || !true)
	How does an expression like this get evaluated by the compiler? The order of evaluation when it comes to conditional operators is as follows:
	
	Conditions placed in parentheses - ()
	NOT - !
	AND - &&
	OR - ||
	Using this information, let’s dissect the expression above to find the value of foo:
	
	true && !(false || !true)
	First, we’ll evaluate (false || !true) because it is enclosed within parentheses. Following the order of evaluation, we will evaluate !true, which equals false:
	
	true && !(false || false)
	Then, we’ll evaluate (false || false) which equals false. Now our expression looks like this:
	
	true && !false
	Next, we’ll evaluate !false because it uses the NOT operator. This expression equals true making our expression the following:
	
	true && true
	true && true evaluates to true; therefore, the value of foo is true.
	 */
		
		int guestCount;
	  int restaurantCapacity;
	  boolean isRestaurantOpen;
	  boolean isConfirmed;
	  
	  public Reservation Reservation(int count, int capacity, boolean open) {
		  if (count < 1 || count > 8) {
		      System.out.println("Invalid reservation!");
		    }
	    guestCount = count;
			restaurantCapacity = capacity;
			isRestaurantOpen = open;
	  }  
	  
	  public void confirmReservation() {
	    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
	      System.out.println("Reservation confirmed");
	  isConfirmed = true;
	} else {
	  System.out.println("Reservation denied");
	      isConfirmed = false;
	    }
	  }
	  
	  public void informUser() {
		  if (!isConfirmed) {
	      System.out.println("Unable to confirm reservation, please contact restaurant.");
	    } else {
	      System.out.println("Please enjoy your meal!");
	    }
	  }
	  
	  public static void main(String[] args) {
	    Reservation partyOfThree = new Reservation(3, 12, true);
	    Reservation partyOfFour = new Reservation(4, 3, true);
	    partyOfThree.confirmReservation();
	    partyOfThree.informUser();
	    partyOfFour.confirmReservation();
	    partyOfFour.informUser();
	  }
}
