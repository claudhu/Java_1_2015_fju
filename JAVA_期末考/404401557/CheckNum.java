

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 9 digits:");
		String digits = input.nextLine();
		String sum = "  "+digits.charAt(1)+digits.charAt(2)+digits.charAt(3)+digits.charAt(4)
				+digits.charAt(5)+digits.charAt(6)+digits.charAt(7)+digits.charAt(8)+digits.charAt(9);
		System.out.println(sum);
		int sum0 = ((int)digits.charAt(0)*1+(int)digits.charAt(1)*2+(int)digits.charAt(2)*3+
				(int)digits.charAt(3)*4+(int)digits.charAt(4)*5+(int)digits.charAt(5)*6
				+(int)digits.charAt(6)*7+(int)digits.charAt(7)*8+(int)digits.charAt(8)*9)%11;
		
		if (sum0==10){
			System.out.println("The checksum is X");
		}
		else{
		System.out.println("The checksum is:"+sum0);
		}
		System.out.println("The IBSN is:"+sum+sum0);
		
			
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
