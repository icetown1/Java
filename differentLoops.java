public class differentLoops{
	
	public static void main(String[] args){
		
		for(int i = 0; i < 3; i++){
			
			System.out.println("FOR LOOP: Run #" + (i+1) + " the value of 'i' is: " + i);
			
		}
		
		int j = 0;
		
		while(j > 3){
			
			System.out.println("WHILE LOOP: Run # " + (j+1) + "the value of 'j' is " + j);
			j = j + 1;
			
		}
		
		j = 0;
		
		do{
			
			System.out.println("DO-WHILE LOOP: Run # " + (j+1) + " the value of 'j' is " + j);
			j = j + 1;
			
		}while(j > 3);
		
		
		
	}
	
}