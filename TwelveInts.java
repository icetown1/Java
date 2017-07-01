import java.util.Scanner;

public class TwelveInts{
	
	int[] twelve = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
	
	public static void main(String[] args){
		
		TwelveInts lister = new TwelveInts();
		lister.FirstToLast(lister.twelve);
		lister.LastToFirst(lister.twelve);
		lister.SearchFor();
		
	}
	
	public void FirstToLast(int[] numbers){
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
	}
	
	public void LastToFirst(int[] numbers){
		
		for(int i = numbers.length-1; i >= 0 ; i--){
			
			System.out.print(numbers[i] + " ");
			
		}
		
		System.out.println();
		
	}
	
	public void SearchFor(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a value to search for elements greater than: ");
		int SearchForThingy = keyboard.nextInt();
		boolean found = false;
		
		for(int i = 0; i < twelve.length; i++){
			
			if(twelve[i] > SearchForThingy){
				
				System.out.println("Value greater than (" + SearchForThingy + ") found at index " + i);
				found = true;
				
			}
			
		}
		
		if(found == false){
				
				System.out.println("Error: value ("+SearchForThingy+") not found in array.");
				
		}
		
	}
	
}