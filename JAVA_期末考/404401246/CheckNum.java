import java.util.Scanner;
public class CheckNum {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		System.out.print("please enter 9 digits: ");
		String num = input.nextLine();
		
		char num1 = num.charAt(0);
		char num2 = num.charAt(1);
		char num3 = num.charAt(2);
		char num4 = num.charAt(3);
		char num5 = num.charAt(4);
		char num6 = num.charAt(5);
		char num7 = num.charAt(6);
		char num8 = num.charAt(7);
		char num9 = num.charAt(8);
		
	
		
		if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==0){
			String x = ""+num+0;
			System.out.print("the checksum is: "+"0");
			System.out.println();
			System.out.print("the ISBN is: "+x);
		}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==1){
			String x = ""+num+1;
			System.out.print("the checksum is: "+"1");
			System.out.println();
			System.out.print("the ISBN is: "+x);
		}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==2){
			String x = ""+num+2;
		System.out.print("the checksum is: "+"2");
		System.out.println();
		System.out.print("the ISBN is: "+x);
		}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==3){
			String x = ""+num+3;
		System.out.print("the checksum is: "+"3");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==4){
			String x = ""+num+4;
		System.out.print("the checksum is: "+"4");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==5){
			String x = ""+num+5;
		System.out.print("the checksum is: "+"5");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==6){
			String x = ""+num+6;
		System.out.print("the checksum is: "+"6");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==7){
			String x = ""+num+7;
		System.out.print("the checksum is: "+"7");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==8){
			String x = ""+num+8;
		System.out.print("the checksum is: "+"8");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==9){
			String x = ""+num+9;
		System.out.print("the checksum is: "+"9");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
		else if((num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9) % 11 ==10){
			String x = ""+num+'X';
		System.out.print("the checksum is: "+"X");
		System.out.println();
		System.out.print("the ISBN is: "+x);
	}
	
		
	}
}
