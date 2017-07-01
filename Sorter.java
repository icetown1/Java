public class Sorter{
	
	String[] names = {"Ardelia Ashcroft","Byron Buttner","Jacquelyne Johnson","Tory Torrens","Gordon Guillard","Aurea Ahlers","Tamiko Torrey","Latoya Ledoux","Hai Hudman","Lauren Lenox"};
	double[] hourly = {37.65,94.09,56.52,61.60,52.00,39.76,10.40,23.56,24.83,45.74};
	
	public static void main(String[] args){
		
		Sorter ourObj = new Sorter();
		
		System.out.print("Original, unsorted roster of people and salaries: \n\n");
		
		ourObj.PrintAll(ourObj.hourly, ourObj.names);
		
		ourObj.SortBySalary();
		
		System.out.print("Roster of people and salaries, sorted by salary: \n\n");
		
		ourObj.PrintAll(ourObj.hourly, ourObj.names);
		
	}
	
	public void PrintAll(double[] h, String[] n){
		
		for(int i = 0; i < h.length; i++){
			
			System.out.println(n[i] + " makes " + h[i] + " an hour.");
			
		}
		
	}
	
	public void SortBySalary(){
		
		double temp1;
		String temp2;
		
		for(int i = 0; i < hourly.length; i++){
			
			for(int j = i; j < hourly.length; j++){
				
				if(hourly[j] < hourly[i]){
					
					temp1 = hourly[i];
					hourly[i] = hourly[j];
					hourly[j] = temp1;
					
					temp2 = names[i];
					names[i] = names[j];
					names[j] = temp2;
					
				}
				
			}
			
		}
		
	}
	
}