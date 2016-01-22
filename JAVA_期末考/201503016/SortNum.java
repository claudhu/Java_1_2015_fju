
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the three numbers: ");
		Scanner input =  new Scanner (System.in);
		int[]num = new int[3];
		int temp = 0;
		
		for(int i=1;i<=num.length-1;i++){
        num[i]= input.nextInt();
        System.out.print("    ");}
        
        if (num[2]<num[1])
           temp =num[1];
           num[1]=num[2];
           num[2]=temp;
           
        		   
        if (num[1]<num[0])
        	temp =num[0];
          num[0]=num[1];
           num[1]=temp;
        
            
 
        System.out.print("The sorting result is as follows: \n");
        for(int j=1;j<=num.length-1;j++){
        System.out.printf("%-5d %-5d %-5d", num[j]);}
        	
        	
	}

	}

