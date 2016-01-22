import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Please enter you weight(kg):");
	Scanner input = new Scanner(System.in);
	double weight = input.nextDouble();
	double pound = weight * 2.20462 ;
	System.out.printf("your weight is:" + "%3.2f",pound);
	
					
	}

}
