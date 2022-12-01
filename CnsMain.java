import java.util.*;

class CopyCns{

	String library;
	String section;
	String status;
	

 	
	CopyCns(){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the library");

 		library = sc.nextLine();

 		System.out.println("Enter the section of the library");

		section = sc.nextLine();
		
		System.out.println("Enter the status of the library");

		status = sc.nextLine();	
	}
		
	void display(){
	
		System.out.print("  Librays name is : " + library + " Section : " + section+ " Status : " + status );

	}

}


class CnsMain{

	public static void main( String args [] ){

		CopyCns Sn = new CopyCns();
		Sn.display();
 
	 }
	

}