
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter 9 digits:");
		
		int digit1=input.nextInt();
		int digit2=input.nextInt();
		int digit3=input.nextInt();
		int digit4=input.nextInt();
		int digit5=input.nextInt();
		int digit6=input.nextInt();
		int digit7=input.nextInt();
		int digit8=input.nextInt();
		int digit9=input.nextInt();
		int checknum=(digit1*1 +digit2*2+
				digit3*3+digit4*4
				+digit5*5+digit6*6
				+digit7*7+digit8*8
		
				+digit9*9);
		System.out.println("the checknum is: "+checknum);
		if(checknum==10){
			checknum='x';
			System.out.println(digit1+"" +digit2+""+
					digit3+""+digit4+""
					+digit5+""+digit6+""
					+digit7+""+digit8+""
					+digit9+""+checknum);
	
		}
		else{
			System.out.println(digit1+"" +digit2+""+
					digit3+""+digit4+""
					+digit5+""+digit6+""
					+digit7+""+digit8+""
					+digit9+""+checknum);
		}
	}

}
