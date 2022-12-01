interface Parent{
 
	void show();

}

interface Mother{

 	void display();

}

interface Son extends Parent,Mother{
	
	void seen();


}

class family implements Son{

	String fname= "Dilip";
	String mname = "Rima";
	String sname = "Paban";

	public void show(){
	
		System.out.println("Father name is : " + fname);
	
	}
	
	public void display(){
	
		System.out.println("Mother name is : " + mname);

	}
		
	public void seen(){

		System.out.println("Son name is : " + sname);	
	
	}


}

class InterFamily{

	public static void main(String args []){

 		family ff = new family();
		ff.show();
		ff.display();
		ff.seen();
	
	}

}