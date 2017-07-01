import java.util.Scanner;

public class CountByAnything{
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number to count by: ");
		
		int x = keyboard.nextInt();
		int y = 0;
		
		for(int i = x; i <= 300; i += x){
			if(y%10 == 0){
				
				System.out.println();
				
			}
			System.out.print(i + " ");
			y++;
		}
		
	}
	
}