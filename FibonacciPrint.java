import java.util.*;

class FibonacciPrint{

	public static void main(String args []){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter how many  Fibonacci number you want to print");
	
	int input = sc.nextInt();
	
	FiboSeries fb = new FiboSeries();
 	
 	// System.out.println(fb.series(input));
 
	int [] arr= new int[input];


 	for(int i =  0 ; i<input ; i++){

 		arr[i] = fb.series(i);
	
		} 

      	System.out.println("The Fibonacci series is ");

	for(int i=0 ; i < arr.length ; i++){

 		System.out.print(arr[i]+ " ");	
		
		}
	

	}

}

class FiboSeries{
	
	
	public int series(int i){
	
	if(i<= 1){

 		return 1;			

		}
	else{
	
 		return series(i - 1) + series(i - 2);
		
		}


	}
}