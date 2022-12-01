class ParentsName{

	public String firstnm = "Mukul";
	
	public String lastnm = "Das";

}

class ChildName extends ParentsName{

	public String Childnm;
	
	void display(String Childnm){

		this.Childnm = Childnm;
	
		System.out.println("Father name is :"+firstnm+" "+lastnm);
		
		System.out.println("Child name is :"+Childnm+" "+super.lastnm);
	
	}

}

class ChildMain{

	public static void main(String args[]){

		ChildName cc = new ChildName();

		cc.display("Kakoli");
	
	}

}