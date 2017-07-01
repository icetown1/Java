// fileName BowlingTeamDemo
// writtenOn 4/23/2017
// writtenBy nicholasMagee

import java.util.*;
public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		String name; //creates the string name
		
		BowlingTeam bowlTeam = new BowlingTeam(); //creates a variable named BowlingTeam with the value of bowlTeam
		
		int x; //creates the integer variable x
		final int NUM_TEAM_MEMBERS = 4; //creates the final integer that wont change it's value
		
		Scanner input = new Scanner(System.in); //creates a scanner named input
		System.out.print("Enter team name >> ");
		name = input.nextLine(); //assigns user input to variable name
		
		bowlTeam.setTeamName(name); //assigns user input name variable to bowlTeam and setTeamName variable
		
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x) //for loop that retreives team member names from the user
		{
			System.out.print("Enter team member's name >> "); //
			name = input.nextLine();
			bowlTeam.setMember(x, name); // Assigns name to an array space
		}
		System.out.println("\nMembers of team " + bowlTeam.getTeamName()); //prints a blank line then the displays the variable 
		
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x) //for loops that lists all names in members array
			System.out.print(bowlTeam.getMember(x) + " "); //print each name in the member array
		System.out.println();
	}
}