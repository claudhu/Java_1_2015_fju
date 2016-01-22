
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 9 digits:");
		String isbn = input.nextLine();
		
		char d1 = isbn.charAt(0);
		char d2 = isbn.charAt(1);
		char d3 = isbn.charAt(2);
		char d4 = isbn.charAt(3);
		char d5 = isbn.charAt(4);
		char d6 = isbn.charAt(5);
		char d7 = isbn.charAt(6);
		char d8 = isbn.charAt(7);
		char d9 = isbn.charAt(8);
		
		int d10 = (d1*1+d2*2
				+d3*3+d4*4
				+d5*5+d6*6
				+d7*7+d8*8
				+d9*9)%11;
		if(d10 == 10){
			System.out.print("The checksum is¡GX");
		}
		else{
		    System.out.print("The checksum is¡G"+d10);
		}
		System.out.print("\nThe ISBN is¡G"+isbn+d10);
		
		input.close();

	}

}
