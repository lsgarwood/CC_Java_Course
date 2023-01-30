package lessons;

public class SemicolonsWhitespace {

	public static void main(String[] args) {
		//this line
		System.out.println("Java is a class-based language.");System.out.println("Java classes have a 'main' method.");System.out.println("Java statements end with a semicolon.");
		
		// is the same as these lines - as Java doesnt interpret whitespace
		// it just makes it easier to read
		
		System.out.println("Java is a class-based language.");
		System.out.println("Java classes have a 'main' method.");
		System.out.println("Java statements end with a semicolon.");
		
		// but it does interpret semicolons, they are used to mark the end of a  statement
		System.out.println("Programming is...mind blowing!"); 
	}

}
