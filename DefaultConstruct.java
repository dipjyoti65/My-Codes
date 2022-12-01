class DefaultConstruct{

	int roll ;
	int pin ;
	int phone;

	public static void main(String args []){

		DefaultConstruct me = new DefaultConstruct();
		me.roll = 50;
		me.pin = 782427;
		me.phone = 863864;

		System.out.println("My phone number is : "+ me.phone +" My pin is : "+  me.pin);


	}


}