//Filename: ArrayMethodDemo
//Written on: 4/14/2017
//Written by: Nicholas Magee

import java.util.Scanner; //Allows user input

public class ArrayMethodDemo{ // create the class

	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//create and assign values to array
	int a, b, i; //creates integer variables
	double total, average; // creates double variables
	
	public static void main(String[] args){//creates main method
	
	ArrayMethodDemo lister = new ArrayMethodDemo();//creates space holder
	lister.FirstToLast();//inserts method
	lister.LastToFirst();//inserts method
	lister.EnterNumberLess();//inserts method
	lister.AboveAverage();//inserts method
	
	}//end main method

	public void FirstToLast(){//creates method
		for(int i = 0; i < numbers.length; i++){//creates for loop
		
			System.out.print(numbers[i] + " ");//prints line
		}//ends for loop
		
		System.out.println();//prints blank line
		
	}//ends method
	
	public void LastToFirst(){//creates method
	
		for(i = numbers.length - 1; i >= 0; i--){//creates for loop
		
			System.out.print(numbers[i] + " ");//prints line
		}//ends for loop
		System.out.println();//prints line
	}
	
	public void EnterNumberLess(){//creates method
		
		System.out.print("Enter a limiting number: ");//prints line
		Scanner keyboard = new Scanner(System.in);//Creates a space for scanner entry
		int a = keyboard.nextInt();//assigns user input to variable a
		System.out.print("Numbers smaller than <" + a + ">: ");//prints the line
			for(b = 0; b < numbers.length; b++){//creates for loop
			
				if(numbers[b] < a){//creates if statement
					System.out.print(numbers[b] + " ");//prints the line
				}//end of if statement
			}//end of for loop
			
			System.out.println();//prints the blank line
	}//ends the method	
	public void AboveAverage(){//creates the method

		System.out.print("Numbers larger than the average: ");//prints the line
		for(i = 0; i < numbers.length; i++){//creates the for loop
		
			average = average + numbers[i];//assigns value to average
		}//end of for loop		
		
		average = average/numbers.length; //creates and gives average value
		
		for(i = 0; i < numbers.length; i++){//creates for loop
			
			if(numbers[i] > average)//creates if statement
				System.out.print(numbers[i] + " ");//prints line
			
		}
			
	}
			
		
	
	
}