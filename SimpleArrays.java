import java.util.Scanner;

public class SimpleArrays{
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		int[] ints = {1, 2, 3, 4};
		double[] doubley = {12.1, 31.0, 3.14};
		String[] words = new String[4];
		
		/*words[0] = "Tulip";
		
		System.out.print("Please enter word #2: ");
		words[1] = keyboard.nextLine();
		
		System.out.print("Please enter word #3: ");
		words[2] = keyboard.nextLine();
		
		System.out.print("Please enter word #4: ");
		words[3] = keyboard.nextLine();
		
		System.out.println("The value of words[0] is: " + words[0]);
		System.out.println("The value of words[1] is: " + words[1]);
		System.out.println("The value of words[2] is: " + words[2]);
		System.out.println("The value of words[3] is: " + words[3]);*/
		
		System.out.println(ints[0] + " " + ints[1] + " " + ints[2] + " " + ints[3]);
		
		ints = new int[5];
		
		for(int i = 0; i <= ints.length ; i++){
			
			ints[i] = i+1;
			
			System.out.print(ints[i] + " ");
			
		}
		
		System.out.println();
		
		
		
	}
	
}