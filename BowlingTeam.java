//fileName BowlingTeam
//writtenOn 4/23/2017
//writtenBy nicholasMagee

public class BowlingTeam //creates class
{
	private String teamName; //creates string variable
	private String[] members = new String[4]; //creates string array with 4 available values
	
	public void setTeamName(String team) //creates a method 
	{
		teamName = team; // assigns teamName to team 
	}	
	
	public String getTeamName() // creates the getTeamName method
	{
		return teamName; //returns the value for teamName
	}
	
	public void setMember(int number, String name) // creates the setMember method
	{
		members[number] = name; //assigns variable in array to name variable
	}
	
	public String getMember(int number) //creates the method getMember
	{
		return members[number]; // returns the variable in members array
	}	

}