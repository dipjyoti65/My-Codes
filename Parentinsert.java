class LastName{

	public String lname;
	
	public LastName(String titel){
	
		titel = lname;
	
	}

}


class ParentsName extends LastName{

	private String fname;
	
	void Parentsinsert(String fname,String lname){

		super(lname);

		this.fname = fname;
		
		System.out.println(" Father name is : "+fname+" "+lname);

	}


}

class ChildName extends LastName{

	private String cname;

	void Childinsert(String cname,String lname){

		super(lname);
		
		this.cname = cname;
		
		System.out.println(" Child name is : "+cname+" "+lname);

	}

}

class Parentinsert{

	public static void main(String args[]){

		ParentsName pp = new ParentsName();

		pp.Parentsinsert("Mukul","Kalita");
		
		ChildName cc = new ChildName();
		
		cc.Childinsert("Kakoli","Kalita");

	}

}