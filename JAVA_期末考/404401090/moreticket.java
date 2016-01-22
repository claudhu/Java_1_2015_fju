

import java.util.Scanner;

public class moreticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0;
        while(true){
		System.out.print("Enter the ticket number : ");
		int num = input.nextInt();
		System.out.print("Enter the number of ticket : ");
		int num1=input.nextInt();
		    if(num==1){
		    	sum+=(3000*num1);		    			    	
		    }
		    else if(num==2){
		    	sum+=(2500*num1);
		    }
		    else if(num==3){
		    	sum+=(2000*num1);
		    }
		    else if(num==4){
		    	sum+=(1000*num1);
		    }
		    else if(num==5){
		    	sum+=(500*num1);
		    }
		    else if(num==0){
		    	break;
		    }
		    
        }
        System.out.print("The price is "+sum);
	}

}
