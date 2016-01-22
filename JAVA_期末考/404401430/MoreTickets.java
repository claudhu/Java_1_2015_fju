

import java.util.Scanner;

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int count =0;
		while(true){
			System.out.print("Which kind of ticket do you want to buy?(number 1 to 5):");
			int i = input.nextInt();
			System.out.print("How many do you want?:");
			int j = input.nextInt();
			
			for(int a=0;a>=0;a++){
				if(i == 1)
					count = 3000*j;
				else if(i==2)
					count = 2500*j;
				else if(i==3)
					count = 2000*j;
				else if(i==4)
					count = 1000*j;
				else if(i==5)
					count = 500*j;
			}
			count++;
			
			if(i==0)
				System.out.println("total:"+count+" dollars");
			
			
				}

	}

}
