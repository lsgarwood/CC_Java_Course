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
	/*A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: {, and }. Everything inside the curly braces is part of the task. This domain is called the scope of a method.

We can’t access variables that are declared inside a method in code that is outside the scope of that method.*/
	
	// Adding Parameters
	/* Adding parameter values impacts our method’s signature. Like constructor signatures, the method signature includes the method name as well as the parameter types of the method. The signature of the above method is startRadio(double, String)
	 * Note that when we call on a method with multiple parameters, the arguments given in the call must be placed in the same order as the parameters appear in the signature. If the argument types do not match the parameter types, we’ll receive an error.
	 Through method overloading, our Java programs can contain multiple methods with the same name as long as each method’s parameter list is unique.
	 */
	
	// Reassigning Instance Fields
	/* Two of the methods we need are depositing and withdrawing:

public class SavingsAccount{
  double balance;
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }
 
  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }
 
  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }
 
  public static void main(String[] args){
 
  }
}
These methods would change the value of the variable balance. We can reassign balance to be a new value by using our assignment operator, =, again.

public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}
Now, when we call deposit(), it should change the value of the instance field balance:

public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}
This code first prints 2000, the initial value of myAccount.balance, and then prints 2100, which is the value of myAccount.balance after the deposit() method has run.

Changing instance fields is how we change the state of an object and make our objects more flexible and realistic.*/
	
	//Returns
	/* In past exercises, when creating new methods, we used the keyword void. Here, we are replacing void with int, to signify that the return type is an int.
	 * 
	 * The void keyword (which means “completely empty”) indicates that no value is returned after calling that method.

A non-void method, like numberOfTires() returns a value when it is called. We can use datatype keywords (such as int, char, etc.) to specify the type of value the method should return. The return value’s type must match the return type of the method. If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.

Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so:

public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}
Within main(), we called the numberOfTires() method on myCar. Since the method returns an int value of 4, we store the value in an integer variable called numTires. If we printed numTires, we would see 4.
	 * 
	 * We learned how to return primitive values from a method, but what if we wanted our method to return an object? Returning an object works a little differently than returning a primitive value. When we return a primitive value, a copy of the value is returned; however, when we return an object, we return a reference to the object instead of a copy of it.

Let’s create a second class, carLot, that takes in a Car as a parameter and contains a method which returns a Car object.

class CarLot {
    Car carInLot;
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }
 
    public Car returnACar() {
        // return Car object
        return carInLot;
    }
 
    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar); 
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}
This code outputs the same memory address because myCar and carInLot have the same reference value:

Car@2f333739
Car@2f333739
	 * 
	 * */
	
	// .toString() method
	/* When we print out Objects, we often see a String that is not very helpful in determining what the Object represents. In the last lesson, we saw that when we printed our Store objects, we would see output like:

Store@6bc7c054
where Store is the name of the object and 6bc7c054 is its position in memory.

This doesn’t tell us anything about what the Store sells, the price, or the other instance fields we’ve defined. We can add a method to our classes that makes this printout more descriptive.

When we define a toString() method for a class, we can return a String that will print when we print the object:

class Car {
 
    String color;
 
    public Car(String carColor) {
        color = carColor;
    }
 
    public static void main(String[] args){
        Car myCar = new Car("red");
        System.out.println(myCar);
    }
 
   public String toString(){
       return "This is a " + color + " car!";
   }
}
When this runs, the command System.out.println(myCar) will print This is a red car!, which tells us about the Object myCar. */
	
	
}
