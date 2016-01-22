import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 9 digits: ");
		int ninedigits = input.nextInt(); 
		int d1 = ninedigits/100000000%10;
		int d2 = ninedigits/10000000%10;
		int d3 = ninedigits/1000000%10;
		int d4 = ninedigits/100000%10;
		int d5 = ninedigits/10000%10;
		int d6 = ninedigits/1000%10;
		int d7 = ninedigits/100%10;
		int d8 = ninedigits/10%10;
		int d9 = ninedigits%10;
		int checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		
	    
		if (checksum==10)
			{System.out.println("\nThe checksum is: x");
			System.out.print("The ISBN is:"+ninedigits+"x");}
		
		else if(d1==0)
			{System.out.println("\nThe checksum is: "+checksum);
		    System.out.print("The ISBN is: 0"+ninedigits+checksum);
		    }
		else    
			{System.out.println("\nThe checksum is: "+checksum);
		    System.out.print("The ISBN is:"+ninedigits+checksum);
		    }
	}

}
