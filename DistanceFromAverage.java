import java.util.Scanner;

public class DistanceFromAverage{
	
	Scanner keyboard = new Scanner(System.in);
	double[] twentyNums = new double[20];
	double average = 0.0;
	double totalEntries = 0.0;
	
	public static void main(String[] args){
		
		DistanceFromAverage avg = new DistanceFromAverage();
		avg.GetInput();
		if(avg.twentyNums[0] != 99999.0){
			
			avg.GetAverage();
			avg.DistanceFrom();
			
		}
		else
		{
			
			System.out.println("At least one number is expected.");
			
		}		
	}
	
	public void GetInput(){
		
		
		for(int i = 0; i < twentyNums.length; i++){
			
			System.out.print("Enter decimal #"+(i+1)+"(or 99999 to quit): ");
			twentyNums[i] = keyboard.nextDouble();
			
			if(twentyNums[i] == 99999.0){
				break;
			}
			
			totalEntries = totalEntries + 1.0;
			
		}
		
		
	}
	
	public void GetAverage(){
		
		for(int i = 0; i < totalEntries; i++){
			
			average = average + twentyNums[i];
			
		}
		
		average = average/totalEntries;
		
	}
	
	public void DistanceFrom(){
		
		int i = 0;
		
		while(twentyNums[i] != 99999.0){
			
			System.out.println("The value of twentyNums["+i+"] is " + (twentyNums[i]-average) + " from the average.");
			
			i++;
			
		}
		
	}
	
	
}