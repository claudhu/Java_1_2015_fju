
import java.util.Scanner;
public class prinf {
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 8 numbers:");
        int num[] = new int[8];
   
        for (int i = 0 ; i < num.length ; i++){
        	int count=0;
        	num[i] = input.nextInt();
        	 
        	count++;
        	
         if (count % 4 == 0)
        	System.out.println(); 
        	}
        
        System.out.print(num);
        
        
       }
}
