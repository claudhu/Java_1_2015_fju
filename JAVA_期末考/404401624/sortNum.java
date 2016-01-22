
import java.util.Scanner;
public class sortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input  = new Scanner(System.in);
    
    System.out.println("Please enter three integer:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    
    
    
    int max =0 ,min = 0,mid = 0;
    
    if (num2 >= max && num2 >= num3){
    		num2 = max;
    		if (num3 >= num1){    			
                num3 = mid;
                num1 = min;
    		}
            else 
                num3 = min;
                num1 = mid;
    		}
     else if (num3 >= max && num3 >= num2)
            num3 = max;
        	if (num2 > num1){
        		num2 = mid;
        	    num1 = min;
        		 }
        	else
        		num1 = mid;
        	    num2 = min;
        		 }
        	 
      else (num 1 >= max )
         num1 = max;
          if (num2 >= num3){
            	num2 = mid;
                num3 = min;
            }
                else
                	num3 = mid;
                    num2 = min;
                    }
         
        	 
          
    
    System.out.println("The sorting result is as follows:" + max + " " + mid + " " + min);  
	}
  

	}


