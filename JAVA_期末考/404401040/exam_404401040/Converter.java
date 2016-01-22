
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input= new Scanner(System.in);
   
    System.out.print("Enter your weight in pound:");
	double pound = input.nextDouble();
     
    double KG = pound / 2.20462;
     System.out.print("Your weight is: "+ KG);
    
	}

}
