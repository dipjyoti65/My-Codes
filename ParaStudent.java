class ParaStudent{

	String name;
	String Add;
	int roll;

	ParaStudent(String name, String Add, int roll){

		this.name = name;
		this.Add =  Add;
		this.roll = roll;
	}

	@Override public String toString(){

	return String.format(name + Add + roll);

	}	
	
	public static void main(String args []){

		ParaStudent pp = new ParaStudent("Saurave ", " Guwahati ", 5);

	//	System.out.println(pp.name);

	//	System.out.println(pp.Add);
		
	//	System.out.println(pp.roll);

		System.out.println(pp);

	}


}


