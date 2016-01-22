import java.util.Scanner;


public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 9 digits:");
		String digits=input.nextLine();
		
		char d1 = digits.charAt(0);
		char d2 = digits.charAt(1);
		char d3 = digits.charAt(2);
		char d4 = digits.charAt(3);
		char d5 = digits.charAt(4);
		char d6 = digits.charAt(5);
		char d7 = digits.charAt(6);
		char d8 = digits.charAt(7);
		char d9 = digits.charAt(8);
		
		int Checksum = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
		
		if (Checksum==10){
			System.out.println("The checksum is:X");
		    System.out.println("The ISBN is:"+digits+"X");}
		    else
			System.out.println("The checksum is:"+Checksum);
		    System.out.println("The ISBN is:"+digits+Checksum);
	

	}

}
