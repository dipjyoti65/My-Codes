import java.util.*;

class ParentCharacter{

	String fname,lname="Kakoti";
	
	int age;	

	void showname(String fn){

		fname = fn;	

	}

	void fage(int age){

		this.age = age;

	}
	
	void display(){

		System.out.println("Father name is : "+fname+" "+lname);

		System.out.println("Father age is : "+age);
	}

}

class ChildCharacter extends ParentCharacter{


	void display(){

		System.out.println("Child name is : "+fname+" "+lname);

		System.out.println("Child age is : "+age);

	}

}


class ParentChr{

	public static void main(String args []){

		Scanner sc = new Scanner(System.in);
		
		ParentCharacter pa = new ParentCharacter();

		ChildCharacter ch = new ChildCharacter();

		System.out.println("Enter the name of Father : ");

		String fn = sc.next();

		pa.showname(fn);
		
		System.out.println("Enter the age of Father : ");
		
		int age = sc.nextInt();
		
		pa.fage(age);

		pa.display();
		
		System.out.println("Enter the name of Child : ");

		fn = sc.next();

		ch.showname(fn);
		
		System.out.println("Enter the age of Child : ");
		
		age = sc.nextInt();

		ch.fage(age);

		ch.display();

	}

}