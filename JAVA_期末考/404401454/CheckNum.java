import java.util.Scanner;


public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 9 digits :");
        int a = input.nextInt();
        int d1 = a/100000000 ;
        int d2 = a/10000000%10  ;
        int d3 = a/1000000%10   ;
        int d4 = a/100000%10    ;
        int d5 = a/10000%10     ;
        int d6 = a/1000%10      ;
        int d7 = a/100%10       ; 
        int d8 = a/10%10        ;
        int d9 = a%10         ;
        int d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11 ;
        if(d10==10 && d1==0){
        	System.out.println("The checksum is : X" );
        	System.out.print("The ISBN is :"+0+a+"X" );
        }
        else if(d10==10 ){
        	System.out.println("The checksum is : X" );
        	System.out.print("The ISBN is :"+a+"X" );
        	}
        else if(d1==0){
        	System.out.println("The checksum is : "+d10 );
            System.out.println("The ISBN is :"+0+a+d10 );
        }
        else { 
        	System.out.println("The checksum is : "+d10 );
            System.out.printf("The ISBN is :%10d%d",a,d10 );
        }
        
        
     }

}
