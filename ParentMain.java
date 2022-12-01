class LastName{

	public String lname;
	
	public LastName(String titel){
	
		titel = lname;
	
	}

}


class ParentsName extends LastName{

	private String fname;
	
	public ParentsName(String fname,String lname){

		super(lname);

		this.fname = fname;
		
		System.out.println(" Father name is : "+fname+" "+lname);

	}


}

class ChildName extends LastName{

	private String cname;

	public ChildName(String cname,String lname){

		super(lname);
		
		this.cname = cname;
		
		System.out.println(" Child name is : "+cname+" "+lname);

	}

}

class ParentMain{

	public static void main(String args[]){

		ParentsName pp = new ParentsName("Mukul","Kalita");
		
		ChildName cc = new ChildName("Kakoli","Kalita");

	}

}