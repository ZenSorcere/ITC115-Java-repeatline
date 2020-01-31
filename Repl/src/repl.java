
//*******************************************************************
//  repl ("repeat line") Class 
//	ITC 115 - Winter 2020 - Assignment 4
//
// This class takes in user input of a String and repeats it a certain number of times.
// The user is asked to enter a word or phrase, and asked how many times to repeat it. 
// NOTE: I would have named the method "repl" but Eclipse said the method had a constructor
// name, so I opted to change it to "repline".
//
// Tests run with multiple words, numbers as the String, and with both pos/neg integer values,
// as well as with zero.
//
// By: Mike Gilson
// Date 1/31/2020
//*******************************************************************

// import Scanner object for user input
import java.util.Scanner;

public class repl {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		// get user input for String "phrase" to repeat
		System.out.print("Enter a word or phrase: ");
		String phrase = console.nextLine(); // use nextLine for multiple words
		
		// get user input for the number "rep" for how many repetitions. A double is used
		// here and cast an an int within the method to avoid errors being thrown.
		System.out.print("How many repetitions? ");
		double rep = console.nextDouble();
		
		// final String will be determined by the repline method
		// which takes in the "phrase" and "rep" variables as parameters
		String result = repline(phrase, rep);
		
		
		// display the final version of the "result" variable, after the repline method
		System.out.println(result);
		
	} // End of main method

	//voids cannot return info, so we callout that the method repline will
	//return a String, with the variables of a String and a number (a double, in this case).
	public static String repline(String phrase, double rep) {
		
		// since we'll be returning the "result" string, we need to declare the 
		//empty variable first
		String result = "";
		
		// an if statement is used in case a non-repeatable number is passed through.
		// a zero or negative number will be dealt with separately from a positive number.
		if (rep <= 0) {
			
			// book says to return an empty string, but I opted to return a result to 
			// ensure all aspects of the code worked (and for some added character).
			result = "You asked for " + rep + " repetitions? \n"
					+ "You get NOTHING. Good DAY, sir!";
			
		// for positive numbers, an else statement is used to repeat the initial "phrase"
		// parameter. The for loop loops through a number of times equal to the "rep"
		// parameter (cast as an int to prevent errors), updating the "result" variable 
		// each time by adding the "phrase" parameter to the end of the previous "result",
		// thus producing the desired println as specified by the book's instructions.
		} else {
			for (int i=1; i<= (int)rep; i++) {
					result = result + phrase;
					
			} // End of for

		} // End of if/else
		
		// Outside of the if/else statement, we will have a final "result" being
		// returned to the main to be displayed.
		return result;
		
	} // End of repl method
} // End of repl Class