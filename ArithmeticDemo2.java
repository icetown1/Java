// fileName ArithmeticDemo
// writtenOn 4/24/2017
// writtenBy nicholasMagee

import java.util.Scanner; //adds scanner tool to the 

public class ArithmeticDemo
{
	public static void main(String[] args)
	{
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an number >> ");
		firstNumber = input.nextDouble();
		
		System.out.print("Please enter another number >> ");
		secondNumber = input.nextDouble();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
	
	{
}