import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in)  ;
		System.out.println("Please enter you choice. ") ;
		System.out.println("1. Zhu Alun") ;
		System.out.println("2. Cai Aying") ;
		System.out.println("3. Song Ayu") ;
		System.out.println("4. None of them") ;
		
		int r1=0, r2=0, r3=0, r4=0 ;
		for (int i=0; i<10; i++) {
			int j = 10-i ;
			System.out.println("You have " + j + " remained.") ;
			int a  = input.nextInt();
			
		switch(a) {
		
		case 1 : r1++ ;
		    break;
		case 2 : r2++ ;
		    break;
		case 3 : r3++;
		    break;
		case 4 : r4++;
		}
		
		}
		
		System.out.println("The result of this election is :") ;
		System.out.println("1. Zhu Alun:  " + r1 ) ;
		System.out.println("2. Cai Aying:  " + r2) ;
		System.out.println("3. Song Ayu:  " + r3) ;
		System.out.println("4. None of them:  " + r4 ) ;
 	}

}
