// fileName AverageOfQuizzes
// writtenOn 4/23/2017
// writtenBy nicholasMagee

import java.util.*;
public class AverageOfQuizzes
{
	public static void main(String[] args)
	{
		int[] scores = new int[10]; //creates and stores the ten integer array scores 
		int score = 0; //creates an integer named score and gives it a value of 0
		int count = 0;
		int total = 0;
		final int QUIT = 999; //assigns permanent value to QUIT
		final int MAX = 10; // assigns permanent value to MAX
		Scanner input = new Scanner(System.in); //Adds a scanner to input variables
		System.out.print("Enter quiz score or " + QUIT + " to quit    >> "); //prompts for input from user
		score = input.nextInt(); //assigns next user input to variable score
		
		while(score != QUIT) //As long as score variable isn't equal to QUIT the loop will run
		{
			scores[count] = score; //User input for quiz score is assigned the 0 space in the scores array
			total += scores[count]; //total is added values in the scores array. The score is added to the total
			++count; //move to the next space array space
			if(count == MAX) //creates an if statement to run if the variable count is equal to the variable MAX which is currently set at 10
				score = QUIT; //assigns the variable score the value of QUIT which is currently 999
			else //creates an else statement to run should the input not match the if statement
			{
				System.out.print("Enter next quiz score or " + QUIT + " to quit >> ");
				score = input.nextInt(); //assign the user input to the variable score
			}
		
		}
		System.out.print("\nThe scores entered were: "); // creates a blank line and prints the message below
		for(int x = 0; x < count; ++x) //creates for statement
			System.out.print(scores[x] + " ");
		if(count != 0) //creates if statement when the user has input data they receive the average of quizzes entered
			System.out.println("\n The average is " + (total * 1.0 / count)); //prints the line and averages the total and count variables
		else //creates else statement should the score variable by equal to 0
			System.out.println("No scores were entered."); //prints the line
	}

}