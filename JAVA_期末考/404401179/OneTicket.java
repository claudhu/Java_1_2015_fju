import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
	    System.out.println("Please enter ticket number: ");
	  
	    int k = input.nextInt();
	
	   	System.out.println("Please enter the amounts of tickets: ");
        int n = input.nextInt();
	   	int a = 3000 ;
	    int b = 2500 ;
	    int c = 2000 ;
	    int d = 1000 ;
	    int e = 500;

	    
	    int cost = n * k;
	    
	
	    if (k == a){
	    	    System.out.println("The cost of the tickets is: "+cost);
	    }
	    	else if (k == b){
	    	    System.out.println("The cost of the tickets is: "+cost);
	    	}
	      	else if (k == c){
	    		System.out.println("The cost of the tickets is: "+cost);
	    }
	      	else if (k == d){
	    		System.out.println("The cost of the tickets is: "+cost);
	    }   	
	    	else {  
	    		System.out.println("The cost of the tickets is: "+cost);
	    	}	
	    
	    
	    

	    
	
	}
	
}
