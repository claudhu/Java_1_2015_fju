

import java.util.Scanner;

public class moretickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 System.out.println("块布腹,计秖");
		 
		 
		 int a = input.nextInt();
		
		int total =0;
		
		while(a!=0){
		
			int b =input.nextInt();
			System.out.println("块布腹,计秖");
			 
		int answer =0;
		
		if(a==1){
			answer=3000*b;
		}
		else if(a==2){
			answer=2500*b;
		}
		else if(a==3){
			answer=2000*b;
	}
		else if(a==4){
			answer=1000*b;
	}
		else if(a==5){
			answer=500*b;
		}
		a = input.nextInt();
		
		total=total+answer;
		
		}
		System.out.println(total);	
	
	}

}
