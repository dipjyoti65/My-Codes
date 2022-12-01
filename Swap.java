import java.util.*;
class swapnum{
	
	void swap(int a,int b){
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("The value of a & b is : "+a+","+b);
	
	}
}

class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		swapnum sp = new swapnum();
		sp.swap(a,b);
	}

}