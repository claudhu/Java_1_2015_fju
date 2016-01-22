
import java.util.*;
public class CheckNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter 9 digits : ");
		int digits = input.nextInt();
		int digits2 = digits;
		int sum=0,n=0;
		for(int i=9; i>0; i--){
			n = digits2%10;
			sum += n*i;
			digits2/=10;
		}
		int checksum = sum%11;
		System.out.printf("The checksum is: %d\n",checksum);
		if(checksum==10)
			System.out.printf("The ISBN is: %dX",digits,checksum);
		else
			System.out.printf("The ISBN is: %d%d",digits,checksum);
	}

}
