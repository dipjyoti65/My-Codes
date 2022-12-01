 

class CopyCons{
		
	int weight = 30 ;
	
            CopyCons(){
 					
		System.out.println( " Previous weight is : " + weight );

		}
            

            CopyCons( int weight){

                this.weight = weight;

            }

            CopyCons (CopyCons S ){
                this.weight = S.weight;

            }

            @Override public  String toString(){
                return String.format("My weight is : " + weight);
            }


	public static void main(String args []){
     	
 	

        CopyCons s = new CopyCons();
        CopyCons s1 = new CopyCons(s);

        s1.weight = 50;
        System.out.println(s  +  " After Deep copy ( Previous weight is retained )");
        System.out.println(s1);

        CopyCons S_copy = s;

        S_copy.weight = 50;

        System.out.println(s + " After Shallow copy ( Previous weight is changed) ");
        System.out.println(S_copy);


	}

}