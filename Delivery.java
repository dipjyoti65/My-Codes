import java.util.*;

class Delivery{

 	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("what is your location status " + "\n");
		
		System.out.println(" Press 1 for Home , 2 for Office deilvery " + "\n");
		
		//System.out.println("\n");
		
		int location = sc.nextInt();
		
		switch(location){
		
		case 1:
			System.out.println("Your delivery will be send to Home ");
			break;

		case 2:

			System.out.println("Your delivery will be send to office" );
		
		}	

	}

}