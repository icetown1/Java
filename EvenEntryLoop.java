//Filename EvenEntryLoop
//Written on 4/14/2017
//Written by Nicholas Magee

import java.util.Scanner; //imports the Scanner tool

public class EvenEntryLoop //creates the class
{ //begins the class
	
	public static void main(String[] args)//creates the method
	{ //begins the main method
		
		Scanner keyboard = new Scanner(System.in); //Assign Scanner to variable keyboard
		System.out.println(); //Prints a blank line
		System.out.print("Please enter an even number, or '999' to quit: "); //Print line
		int x; //Adds the integer variable x
		x = keyboard.nextInt(); //assign next user entry to x
		
		while(x != 999) //creaates the while loop
		{//begins the while loop
			
			if(x%2 == 0)//creates the if statement
			{ //begins if statement
			
				System.out.println(); //Print blank line
				System.out.println("Good work!"); //Print line
				System.out.println();//prints blank line
				System.out.print("Please enter an even number: ");//prints the line
				x = keyboard.nextInt(); //assigns next user entry to x
				
			} //End if statement
		
			else if(x%2 != 0)//creates else if
			{ //begins else/if statement
				
				System.out.println(); //Prints blank line
				System.out.print("Error. Not an even number. "); //Print line
				System.out.print("Please enter an even number, or '999' to quit: "); //prints the line
				x = keyboard.nextInt(); //assigns next user entry to x
				
			} //End else if statement
			
			else//creates else statement
			{ //beginss an else statement
				
				System.out.println(); //prints the line
				System.out.print("Error. Please enter an even number, or '999' to exit. "); //Prints the line
				x = keyboard.nextInt(); //assigns next user entry to x
			
			}//Ends the else statement
				
		}//Ends the while loop	
		
		System.out.println(); //prints blank line
		System.out.println("Goodbye!"); //prints the line
		
	} //Ends the public main method
	
} //Ends the class