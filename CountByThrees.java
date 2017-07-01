public class CountByThrees{
	
	public static void main(String[] args){
		
		CountByThrees counter = new CountByThrees();
		counter.CountThree();
		
	}
	
	public void CountThree(){
		
		for(int i = 3; i <= 300; i+=3){
			if(i%30 == 0)System.out.println();
			System.out.print(i + " ");
		}
		
	}
	
}