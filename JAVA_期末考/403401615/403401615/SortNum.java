import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the three numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num1 + " " +num2+ " " + num3);
		if(num1 < num2 && num1 < num3 && num2 < num3){
			System.out.println("The Sorting result is as follows : ");
		    System.out.println(num1 + " "+num2+" "+num3);
		}
		
		else if(num2 < num1 && num2 < num3 && num1 < num3){
			System.out.println("The Sorting result is as follows : ");
			System.out.println(num2 + " "+num1+" "+num3);
		}
		else if(num3 < num1 && num3 < num2 && num1 < num2){
			System.out.println("The Sorting result is as follows : ");
			System.out.println(num3 + " "+num1+" "+num2);
		}
		else if(num3 < num1 && num3 < num2 && num2 < num1){
			System.out.println("The Sorting result is as follows : ");
			System.out.println(num3 + " "+num2+" "+num1);
		}
		else if(num1 < num2 && num1 < num3 && num3 < num2){
			System.out.println("The Sorting result is as follows : ");
			System.out.println(num1 + " "+num3+" "+num2);
		}
		else if(num2 < num1 && num2 < num3 && num3 < num1){
			System.out.println("The Sorting result is as follows : ");
			System.out.println(num2 + " "+num3+" "+num1);
		}
		
	}

}
