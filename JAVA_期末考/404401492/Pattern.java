import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a numbers :");
      int num = input.nextInt();
      System.out.print("Your square looks like:");
      for (int i =0 ; i<=num ; i++){
    	  for (int j = 0 ; j <i ; j++){
    		  System.out.print("*");
    		  if(i>j){
    			  System.out.print("#");
    		  }
    			  }
    	  System.out.println();
    	  
      }
      
      
	}

}
