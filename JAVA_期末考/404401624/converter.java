
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your weight:");
    double num = input.nextDouble();
    double pound = num*2.20462;
    
    System.out.println("Kilogram : " + num);
    System.out.printf("Pound : " + pound );
    
	}

}
