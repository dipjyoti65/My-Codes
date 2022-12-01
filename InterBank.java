interface criditcard{
	void criditissue();

}

interface debitcard{
	void debitissue();
}

interface mastercard{
 	void masterissue();
}

class Bank implements criditcard,debitcard,mastercard{

	void criditissue(){
		System.out.println("Bank provide criditcard");
	}	
	void debitissue(){
		System.out.println("Bank provide debitcard");
	}
	void masterissue(){
		System.out.println("Bank provide mastercard");
	}
}

class InterBank{
	public static void main(String args []){
		Bank sbi = new Bank();
		sbi.criditissue();
		sbi.debitissue();
		sbi.masterissue();
	}
}