package lessons;

public class ObjectOrientedJava {

	public static void main(String[] args) {
		/* All programs require one or more classes that act as a model for the world.
		For example, a program to track student test scores might have Student, Course, and Grade classes. Our real-world concerns, students and their grades, are inside the program as classes.
		We represent each student as an instance, or object, of the Student class.
		This is object-oriented programming because programs are built around objects and their interactions. An object contains state and behavior.*/
		
		/* 
		public class Car {
		// scope of Car class starts after curly brace
		
		// Classes instance fields
	  	// declare instance fields inside the class by specifying the type and name
	  	String color;
			
			// constructor method with a parameter
			// A formal parameter specifies the type and name of data that can be passed into a method e.g String carColor
			public Car(String carColor) {
				// instructions for creating a Car instance
				// instance fields available in scope of constructor method
				// parameter value assigned to the field
				color = carColor;
			}  
 
  			public static void main(String[] args) {
    		// scope of main() starts after curly brace
    		// body of main method
    		
    		// program tasks
    		
    		// Invoke the constructor
    			Car ferrari = new Car(); 
  			}
  			// scope of main() ends after curly brace
		}
		// scope of Car class ends after curly brace
		*/
		
		/* Overloading
		In Java, because of constructor overloading, a class can have multiple constructors as long as they have different parameter values. The signature is useful in that it helps the compiler differentiate between the different methods. For example:

		public class Car {
			String color;
			int mpg;
			boolean isElectric;
			 
			// constructor 1
			public Car(String carColor, int milesPerGallon) {
			    color = carColor;
			    mpg = milesPerGallon;
			}
			
			// constructor 2
			public Car(boolean electricCar, int milesPerGallon) {
			    isElectric = electricCar;
			    mpg = milesPerGallon;
			}
		}
		
		In the example above, there are two constructors. When we initialize an object, the compiler will know which constructor to use because of the values we pass into it. For example, Car myCar = new Car(true, 40) will be created by the second constructor because the arguments match the type and order of the second constructor’s signature.

		If we do not define a constructor, the Java compiler will generate a default constructor that contains no arguments and assigns the object default values. Default values can be created by assigning values to the instance fields during their declaration:

		public class Car {
  			String color = "red";
  			boolean isElectric = false;
  			int cupHolders = 4;
 
	  		public static void main(String[] args) {
	    		Car myCar = new Car();
	    		System.out.println(myCar.color); // Prints: red
	  		}
		}
			*/
		
	}

}
