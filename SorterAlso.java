public class SorterAlso{
	
	public static void main(String[] args){
		
		int[] ages = {123,41,73,82,57,28,37,92,50,41};
		int temp;
		
		System.out.println("Original Array:");
		for(int i = 0; i < ages.length; i++){
			
			System.out.print(ages[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i < ages.length; i++){
			
			for(int j = i; j < ages.length; j++){
				
				if(ages[j] < ages[i]){
					temp = ages[i];
					ages[i] = ages[j];
					ages[j] = temp;
				}
				
			}
			
		}
		
		System.out.println("\n Sorted Array");
		for(int i = 0; i < ages.length; i++){
			
			System.out.print(ages[i] + " ");
			
		}
		
		
	}
	
	
	
}