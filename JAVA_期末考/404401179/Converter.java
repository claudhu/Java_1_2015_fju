import java.util.Scanner;
public class Converter {  //kilos turn pounds

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter your weight(kilo): ");
    
    double weight = input.nextDouble();
    double pounds = 2.20462 * weight ;
    
    System.out.printf("Your weight is equel to %5.5s pounds.",pounds);
    
    
    
    
    
	}

}
