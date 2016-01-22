
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three numbers : ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		selectionSort(num1 ,num2 ,num3);
		
		System.out.println("The sorting result is as follows : " + (selectionSort( num1,num2,num3)));

		
	}

	public static int selectionSort( int num1,int  num2,int  num3) {
		
		int number1=0;
	    int number2=0;
	    int number3=0;
		if(num1>num2){
			
	    	num1 = number1;
			num1 = num2;
			num2 = number1;
			return num2;
		}
	    else if(num2>num3){
	    	
	    	num2 = number2;
	        num2 = num3;
	        num3 = number2;
	        return num3;
	    }
	    else if(num3<num1){
	    	
			num3 = number3;
	        num3 = num1;
	        num1 = number3;
	        return num1;
	       
	    }
		return number3;
		
		
		
	    
		
	}
}
