package lessons;

public class Variables {

	public static void main(String[] args) {
		String name = "James Gosling";
	    int yearCreated = 1995;

	    System.out.println(name);
	    System.out.println(yearCreated);
	    
	    //Primitive data types:
	    // Ints
	    //This is where you will define your variable
	    int numComments = 6;
	    //This is where you will print your variable
	    System.out.println(numComments);
	    
	    //Doubles
	    double androidShare = 81.7;
	    System.out.println(androidShare);
	    
	    //boolean
	    //can ints hold decimals?
	    boolean intsCanHoldDecimals = false;
	    //print it
	    System.out.println(intsCanHoldDecimals);
	    
	    //char - ni single quotes
	    char expectedGrade = 'A';
	    System.out.println(expectedGrade);
	    
	    //Objects
	    // A String literal is any sequence of characters enclosed in double-quotes ("")
	    String greeting = "Hello World";
	    
	    // or String object by calling the String class when declaring a String
	    String salutations = new String("Hello World");
	  
	    // escape sequences - can add quotes to a string
	    System.out.println("\"Hello World\"");
	    // Prints: "Hello World"
	    
	    // backslashes
	    System.out.println("This is the backslash symbol: \\");
	    // Prints: This is the backslash symbol: \
	    
	    /// \n makes a new line in a string
	    System.out.println("Hello\nGoodbye");
	    /*
	    Prints:
	    Hello
	    Goodbye
	    */
	}

}
