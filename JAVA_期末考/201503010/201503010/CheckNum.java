import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in) ;
		System.out.print("Please enter 9 digits : ") ;
		int a = input.nextInt() ;
		
		int[] list = new int[9] ; 
		int tem = a ;
		for(int i=0; i<list.length-1; i++) {
			list[i] = tem / (int)(Math.pow(10, (8-i))) ;
			tem = tem - (list[i]*(int)(Math.pow(10, (8-i))));
		}
		list[8] = a % 10 ;
 		
		
		int b ;
	    b = ((list[0]) + (list[1]*2) + (list[2]*3) + (list[3]*4) + (list[4]*5) + (list[5]*6) + (list[6]*7) + (list[7]*8) + (list[8]*9)) % 11 ;
 		
	    if( b==10) {
			System.out.println("The checksum is: X ") ;
		    System.out.print("The ISBN is: " + a + "X") ;
		}
	    
	    else if(list[0]==0 && b!=10) {
			System.out.println("The checksum is: " + b) ;
		    System.out.print("The ISBN is: 0" + a + b) ;
	    }
	    
		else {
			System.out.println("The checksum is: " + b) ;
	        System.out.print("The ISBN is: " + a + b) ;
		}
	}

}
