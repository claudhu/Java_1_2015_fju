import java.util.Scanner ;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter 9 digits : ");
        String num = input.next();
             
        int digit[ ] = new int [ 9 ];
        int sum = 0 ;
        for ( int i = 0 ; i < digit.length ; i ++ ){
        	digit[i] = num.charAt(i)- 48;
        	sum = sum + digit[i] * (i + 1) ; 
        }
        sum = sum % 11 ;
        
        if ( sum == 10){
        	System.out.println("The checksum is: X ");
        	System.out.println("The ISBN is: " + num + "X");
        }
        else{
        	System.out.println("The checksum is: " + sum);
        	System.out.println("The ISBN is: " + num + "" + sum );
        }
	}

}
