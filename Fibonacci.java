import java.util.*;

class Fibonacci{

	public static void main(String args []){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter which Fibonacci number you want to print");
	
	int input = sc.nextInt();
	
	FiboSeries fb = new FiboSeries();
 	
 	System.out.println(fb.series(input));
	

	}

}

class FiboSeries{
	
	
	public int series(int input){
	
	if(input<= 1){

 		return 1;			

		}
	else{
	
 		return series(input - 1) + series(input - 2);
		
		}


	}
}